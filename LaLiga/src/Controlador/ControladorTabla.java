package Controlador;

import java.util.ArrayList;
import Modelo.Equipo;
import Modelo.ModeloTabla;
import Vista.Tabla;

public class ControladorTabla {
	
	private Tabla tablapos;
	private ArrayList<Equipo> equipos;

	public ControladorTabla(ArrayList<Equipo> equipos) {
		super();
		tablapos = new Tabla();
		tablapos.setLocationRelativeTo(null);
		tablapos.setVisible(true);
		this.equipos=equipos;
		this.cargarJuegos();
		
	}
	
	
	private void cargarJuegos(){
		tablapos.cargarTabla(new ModeloTabla(equipos));
		
	}
	

}
