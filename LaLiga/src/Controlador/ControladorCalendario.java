package Controlador;

import java.util.ArrayList;
import Modelo.Equipo;
import Modelo.ModeloCalendario;
import Modelo.Partido;
import Vista.Calendario;

public class ControladorCalendario {
	
	private Calendario calendario;
	private ArrayList<Partido> juegos;

	public ControladorCalendario(ArrayList<Partido> juegos) {
		super();
		calendario = new Calendario();
		calendario.setLocationRelativeTo(null);
		calendario.setVisible(true);
		this.juegos=juegos;
		this.cargarJuegos();
		
	}
	
	
	private void cargarJuegos(){
		calendario.cargarCalendario(new ModeloCalendario(juegos));
		
	}
	

}
