package Modelo;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import Modelo.Equipo;

public class ModeloCalendario extends AbstractTableModel {
	
	private String [] titulos = {"Fecha", "Equipo Local", "Equipo Visitante","Marcador","Arbitro","Estadio"};
	private ArrayList<Partido> juegos;
	

	public ModeloCalendario(ArrayList<Partido> juegos) {
		super();
		this.juegos= juegos;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return titulos.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return juegos.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		Partido partido = juegos.get(rowIndex);
		
		
		switch(columnIndex)
		{
			case 0: return partido.getFecha();
			case 1: return partido.getLocal().getNombre();
			case 2: return partido.getVisitante().getNombre();
			case 3: return partido.getMarcador();
			case 4: return partido.getJuez().getNombre();
			case 5: return partido.getEstadio();
		}
		return null;
	}
	
	public String getColumnName(int column) {
		return titulos[column];
	}
}
