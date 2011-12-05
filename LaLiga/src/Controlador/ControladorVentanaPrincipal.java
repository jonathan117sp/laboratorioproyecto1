package Controlador;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.io.*;
import java.util.ArrayList;

import javax.swing.JComboBox;

import Vista.VentanaPrincipal;
import Modelo.Arbitro;
import Modelo.Equipo;
import Modelo.Jugador;
import Modelo.Partido;

public class ControladorVentanaPrincipal implements ActionListener 
{
	
	private VentanaPrincipal ventprin;
	private ArrayList<Jugador> jugadores;
	private String[] datos = new String [7];
	private ArrayList<Equipo> equipos;
	private ArrayList<Arbitro> arbitros;
	private static final String[] tipo ={"Arbitro", "Equipo"};
	private String texto;
	
	public ControladorVentanaPrincipal(ArrayList<Equipo> equipos,ArrayList<Arbitro> arbitros)
	{
		super();
		ventprin = new VentanaPrincipal();
		jugadores = new ArrayList<Jugador>();
		ventprin.setLocationRelativeTo(null);
		ventprin.setVisible(true);
		ventprin.agregarListener(this);
		ventprin.agregarTipo(tipo);
		this.equipos=equipos;
		this.arbitros=arbitros;
		this.texto = "";
	}
	
	public void cambioCombo()
	{
		if (ventprin.getTipo().equals(tipo[0]))
		{
			ventprin.setVisibleArbitro(true);
			ventprin.setVisibleEquipo(false);
		}
		else
		{
			ventprin.setVisibleArbitro(false);
			ventprin.setVisibleEquipo(true);
		}
		}
	
	
	public void actionPerformed(ActionEvent e)
	{
		
		if (e.getSource() instanceof JComboBox) {
			cambioCombo();
		}
		
		if (e.getActionCommand().equalsIgnoreCase("Incluir jugadores"))
		{ 
			texto= ventprin.getNombre();
			if(texto=="")
			{
				ventprin.mostrarMensaje("Debe colocar el nombre de algun equipo");
				
			}
			
			
			else
			{
			File archivo = null;
		    FileReader fr = null;
		    BufferedReader br = null;
		    

		      try {
		    	  
		         archivo = new File (texto+".txt");
		         fr = new FileReader (archivo);
		         br = new BufferedReader(fr);

		         String linea;
		        
		        	 int i=0;
		        	 while((linea=br.readLine())!=null)
		        	 {
		        		if (!linea.equals("*"))
		        		{
		        			datos[i]= linea;       	
			        		i=i+1;
		        		}
		        		else
		        		{
		        			Jugador jugador = new Jugador();
		        			jugador.setCedula(datos[0]);
				        	jugador.setNombre(datos[1]);
				        	jugador.setApellido(datos[2]);
				        	jugador.setFechanac(datos[3]);
				         	jugador.setPosicion(datos[4]);
				         	jugador.setGoles(Integer.parseInt(datos[5]));
				         	jugadores.add(jugador);
				         	i=0;
				         	
		        		}
		        		 
		        	 }
		        	 ventprin.mostrarMensaje("Jugadores incluidos");
		        	 
		      }
		      catch(Exception ex){
		         ex.printStackTrace();
		      }finally{
		         try{                    
		            if( null != fr ){   
		               fr.close();     
		            }                  
		         }catch (Exception e2){ 
		            e2.printStackTrace();
		         }
		      
			}
		    
			}
		}
		else 
		{
			if (e.getActionCommand().equalsIgnoreCase("Guardar"))
			{
				
				if(ventprin.getTipo().equals(tipo[1]))
				{
				String codigo, nombre, ciudad, estadio;
				float ano;
				
				codigo = ventprin.getCodigo();
				nombre = ventprin.getNombre();
				ano = ventprin.getAno();
				ciudad = ventprin.getCiudad();
				estadio = ventprin.getEstadio();
				
				Equipo equipo = new Equipo(codigo,nombre,ano,ciudad,estadio,0,0,0,0,0,0);
				
				int i= jugadores.size();
				i=i-1;
				while (i!=-1)
				{
					equipo.agregarJugador(jugadores.get(i));
					i=i-1;
				}
				
				equipos.add(equipo);	
				jugadores.removeAll(jugadores);				
				ventprin.limpiar();
				
				}
				else
				{
				  String cedula, nombre, apellido, fecha;
				  int cantidad;
				  
				  cedula = ventprin.getCedulaArbitro();
				  nombre = ventprin.getNombreArbitro();
				  apellido = ventprin.getApellidoArbitro();
				  fecha = ventprin.getFechaNac();
				  cantidad = (Integer.parseInt(ventprin.getCantidad()));
				  
				  Arbitro arbitro = new Arbitro(cedula,nombre,apellido,fecha,cantidad);
				  
				  arbitros.add(arbitro);
				  
				  ventprin.limpiar();
					
				}
				}
		
		}
		
	}
}
		
		
	
		
	

