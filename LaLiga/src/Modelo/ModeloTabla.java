package Modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.SortOrder;
import javax.swing.table.AbstractTableModel;

import Modelo.Equipo;

public class ModeloTabla extends AbstractTableModel {
	
	private String [] titulos = {"Equipos", "PJ", "PG","PE","PP","GF","GC","Pts"};
	private ArrayList<Equipo> equipos,equipos3;
	

	public ModeloTabla(ArrayList<Equipo> equipos) {
		super();
		this.equipos=equipos;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return titulos.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return equipos.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
			
		ArrayList<Equipo> equipos2 = new ArrayList();
		ArrayList<Equipo> equipos3 = new ArrayList();
		equipos2 = equipos;
				
		int mayor=0;
		int k=0;
		while(equipos2.size()>0)
		{
			for(int i=0;i<equipos2.size();i++)
			{
				if (mayor<equipos2.get(i).calcularPts())
				{
					mayor = equipos2.get(i).calcularPts();
					k=i;
				}
			}
		equipos3.add(equipos2.remove(k));
		mayor=0;
		k=0;
		}
		equipos=equipos3;
		Equipo equipo = equipos.get(rowIndex);
		
		switch(columnIndex)
		{
			case 0: return equipo.getNombre();
			case 1: return equipo.getJj();
			case 2: return equipo.getJg();
			case 3: return equipo.getJe();
			case 4: return equipo.getJp();
			case 5: return equipo.getGf();
			case 6: return equipo.getGc();
			case 7: return equipo.calcularPts();
		}
		return null;
	}
	
	public String getColumnName(int column) {
		return titulos[column];
	}
}
