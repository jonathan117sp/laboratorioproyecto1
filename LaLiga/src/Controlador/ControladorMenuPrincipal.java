package Controlador;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Arbitro;
import Modelo.Equipo;
import Modelo.Jugador;
import Modelo.Partido;
import Vista.MenuPrincipal;
import Vista.VentanaPrincipal;

public class ControladorMenuPrincipal implements ActionListener 
{
	
	private MenuPrincipal Mprincipal;
	private ArrayList<Equipo> equipos;
	private ArrayList<Arbitro> arbitros;
	private ArrayList<Partido> juegos;
	private int n;
	private Calendar c = new GregorianCalendar();
	//private Boolean[] jornada = new Boolean[n];
	
	public ControladorMenuPrincipal() 
	{
		super();
		Mprincipal = new MenuPrincipal();
		Mprincipal.setLocationRelativeTo(null);
		Mprincipal.setVisible(true);
		Mprincipal.agregarListener(this);
		juegos = new ArrayList<Partido>();
		equipos = new ArrayList<Equipo>();
		arbitros = new ArrayList<Arbitro>();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		ControladorCalendario ControlCale;
		ControladorVentanaPrincipal ControlVentana;
		ControladorTabla ControlTabla;
		
		if(e.getActionCommand().equalsIgnoreCase("Registrar datos")){
			ControlVentana= new ControladorVentanaPrincipal(equipos,arbitros);
		}
		else
		{
			if (e.getActionCommand().equalsIgnoreCase("Mostrar Calendario")){
				if(juegos.size()==0)
					Mprincipal.mostrarMensaje("No se han generado partidos");
				else
					ControlCale = new ControladorCalendario(juegos);
				
				
				
			}
			else
				if (e.getActionCommand().equalsIgnoreCase("Tabla de Posiciones")){
					if(equipos.size()==0)
						Mprincipal.mostrarMensaje("No se han registrado equipos");
					else
						ControlTabla= new ControladorTabla(equipos);
				}
				else
				{		if (equipos.size()<4)
							Mprincipal.mostrarMensaje("¡Debe incluir al menos 4 para poder generar los partidos!");
						else
						{
						if (arbitros.size()<equipos.size()/2)
							Mprincipal.mostrarMensaje("Debe incluir al menos "+equipos.size()/2+" arbitros");
						else
						{	
					        n = equipos.size();//arreglo de equipos en ventana principal
							int m = arbitros.size();
							int jornadas = n*2-2;
							int k;
							int golL,golV;
							int diaLocal = (c.get(Calendar.DATE));
							int mesLocal = (c.get(Calendar.MONTH));
							int annioLocal = (c.get(Calendar.YEAR));
							mesLocal++;
							
							
							
							ArrayList<Equipo> equipos2 = new ArrayList();
							for (int i=0;i<((n*2)-2)/2;i++) //Jornada ida
							{
								k=0;
								int j=n-1;
								
								
								for(int z=0;z<n/2;z++)
								{
									Partido partido = new Partido();
									partido.setLocal(equipos.get(k));
									partido.setVisitante(equipos.get(j));
									
									String fecha3= diaLocal+"/"+mesLocal+"/"+annioLocal;
									partido.setFecha(fecha3);
									
									golL = (int)Math.floor(Math.random()*6);
									golV = (int)Math.floor(Math.random()*6);
									
									ArrayList<Jugador> jugaLocal = new ArrayList();
									ArrayList<Jugador> jugaVisi= new ArrayList();
									
									for(int t=0;t<golL;t++)
									{
										int indice=(int)Math.floor(Math.random()*10);
										jugaLocal.add(equipos.get(k).getJugador().get(indice));
										int gol=equipos.get(k).getJugador().get(indice).getGoles();
										equipos.get(k).getJugador().get(indice).setGoles(gol++);
									}
									for(int t=0;t<golV;t++)
									{
										int indice2=(int)Math.floor(Math.random()*10);
										jugaVisi.add(equipos.get(j).getJugador().get(indice2));
										int gol=equipos.get(j).getJugador().get(indice2).getGoles();
										equipos.get(j).getJugador().get(indice2).setGoles(gol++);
									}
									partido.setJugadoresLocales(jugaLocal);
									partido.setJugadoresVisitantes(jugaVisi);
									partido.setEstadio(equipos.get(k).getEstadio());
									partido.setGolLoca(golL);
									partido.setGolVisi(golV);
									partido.determinarPartido();
									m = arbitros.size();
									int arbi=(int)Math.floor(Math.random()*m);
									
									
									partido.setJuez(arbitros.remove(arbi));
									
									juegos.add(partido);
									k++;
									j--;
								}
								
								for(int z=0;z<n/2;z++)
								{
									arbitros.add(juegos.get(z).getJuez());
								}
								if (mesLocal==1|mesLocal==3|mesLocal==5|mesLocal==7|mesLocal==8|mesLocal==10|mesLocal==12)
								{
									if (diaLocal>24)
									{
										diaLocal= 7-(31-diaLocal);
										mesLocal++;
									}
									else
										diaLocal=diaLocal + 7;
								}
								else
								{
									if (mesLocal==4|mesLocal==6|mesLocal==9|mesLocal==11)
									{
										if (diaLocal>23)
										{
											diaLocal= 7-(30-diaLocal);
										    mesLocal++;
										}
										else
											diaLocal = diaLocal + 7;
							
									}
										else
										{
											if (mesLocal==2)
											{
												if (diaLocal>21)
												{
													diaLocal= 7-(28-diaLocal);
													mesLocal++;
												}
												else
													diaLocal = diaLocal + 7;
											}	
										}
								}
								
								if(mesLocal>12)
								{
									annioLocal++;
									mesLocal=1;
								}
								
								for(int q=1;q<n;q++)
									equipos2.add(equipos.remove(1));
								
								equipos.add(equipos2.remove(n-2));
								for(int q=0;q<n-2;q++)
									equipos.add(equipos2.remove(0));
							}
							
							
							for (int i=0;i<((n*2)-2)/2;i++)
							{
								k=0;
								int j=n-1;
								ArrayList<Arbitro> arb = new ArrayList();
								arb = this.arbitros;
								for(int z=0;z<n/2;z++)
								{
									Partido partido = new Partido();
									partido.setLocal(equipos.get(j));
									partido.setVisitante(equipos.get(k));
									
									String fecha3= diaLocal+"/"+mesLocal+"/"+annioLocal;
									partido.setFecha(fecha3);
									
									golL = (int)Math.floor(Math.random()*6);
									golV = (int)Math.floor(Math.random()*6);
									
									ArrayList<Jugador> jugaLocal = new ArrayList();
									ArrayList<Jugador> jugaVisi= new ArrayList();
									
									for(int t=0;t<golL;t++)
									{
										int indice=(int)Math.floor(Math.random()*10);
										jugaLocal.add(equipos.get(j).getJugador().get(indice));
										int gol=equipos.get(j).getJugador().get(indice).getGoles();
										equipos.get(j).getJugador().get(indice).setGoles(gol++);
									}
									for(int t=0;t<golV;t++)
									{
										int indice2=(int)Math.floor(Math.random()*10);
										jugaVisi.add(equipos.get(k).getJugador().get(indice2));
										int gol=equipos.get(k).getJugador().get(indice2).getGoles();
										equipos.get(k).getJugador().get(indice2).setGoles(gol++);
									}
									partido.setJugadoresLocales(jugaLocal);
									partido.setJugadoresVisitantes(jugaVisi);
									partido.setEstadio(equipos.get(j).getEstadio());
									partido.setGolLoca(golL);
									partido.setGolVisi(golV);
									partido.determinarPartido();
									m = arbitros.size();
									int arbi=(int)Math.floor(Math.random()*m);
														
									//int parti=arbitros.get(arbi).getPartidos();
									//arbitros.get(arbi).setPartidos(parti++);
									
								
									partido.setJuez(arbitros.remove(arbi));
									
									juegos.add(partido);
									k++;
									j--;
								}
								for(int z=0;z<n/2;z++)
								{
									arbitros.add(juegos.get(z).getJuez());
								}
								
								if (mesLocal==1|mesLocal==3|mesLocal==5|mesLocal==7|mesLocal==8|mesLocal==10|mesLocal==12)
								{
									if (diaLocal>24)
									{
										diaLocal= 7-(31-diaLocal);
										mesLocal++;
									}
									else
										diaLocal=diaLocal + 7;
								}
								else
								{
									if (mesLocal==4|mesLocal==6|mesLocal==9|mesLocal==11)
									{
										if (diaLocal>23)
										{
											diaLocal= 7-(30-diaLocal);
										    mesLocal++;
										}
										else
											diaLocal = diaLocal + 7;
							
									}
										else
										{
											if (mesLocal==2)
											{
												if (diaLocal>21)
												{
													diaLocal= 7-(28-diaLocal);
													mesLocal++;
												}
												else
													diaLocal = diaLocal + 7;
											}	
										}
								}
								
								if (mesLocal>12)
								{
									annioLocal++;
									mesLocal=1;
								}
								for(int q=1;q<n;q++)
									equipos2.add(equipos.remove(1));
								
								equipos.add(equipos2.remove(n-2));
								for(int q=0;q<n-2;q++)
									equipos.add(equipos2.remove(0));
							}
								
								
							Mprincipal.mostrarMensaje("¡Partidos generados exitosamente!");
								
					}}
				
							
							
							
				}				
		}
	
	}
}
