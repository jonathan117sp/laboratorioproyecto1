package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Partido {

	private String codigo;
	private String fecha;
	private Equipo[] equipos = new Equipo[2];
	private Arbitro juez;
	private int[] marcador = new int [2];
	private ArrayList<Jugador> jugaLocal;
	private ArrayList<Jugador> jugaVisit;
	private String estadio;
	
	
	public Partido() {
		// TODO Auto-generated constructor stub
	}

	public Partido(String codigo, String fecha, Equipo local, Equipo visitante,
			Arbitro juez, int marcador1, int marcador2,String estadio) {
		super();
		this.codigo = codigo;
		this.fecha = fecha;
		this.equipos[0] = local;
		this.equipos[1] = visitante;
		this.juez = juez;
		this.marcador[0]= marcador1;
		this.marcador[1]= marcador2;
		this.jugaLocal = new ArrayList<Jugador>();
		this.jugaVisit = new ArrayList<Jugador>();
		this.estadio = estadio;
	}

	public void setEstadio(String estadio)
	{
		this.estadio= estadio;
	}
	public String getEstadio()
	{
		return estadio;
	}
	public void setJugadoresLocales(ArrayList<Jugador> listjugadoresloca)
	{
		this.jugaLocal=listjugadoresloca;
	}
	
	public void setJugadoresVisitantes(ArrayList<Jugador> listjugadoresvisi)
	{
		this.jugaVisit=listjugadoresvisi;
	}
	
	public String getMarcador()
	{
		
		return marcador[0]+"-"+marcador[1];
	}
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Equipo getLocal() {
		return equipos[0];
	}

	public void setLocal(Equipo local) {
		this.equipos[0] = local;
	}

	public Equipo getVisitante() {
		return equipos[1];
	}

	public void setVisitante(Equipo visitante) {
		this.equipos[1] = visitante;
	}

	public Arbitro getJuez() {
		return juez;
	}

	public void setJuez(Arbitro juez) {
		this.juez = juez;
	}
	
	public void setGolLoca(int gl)
	{
		this.marcador[0] = gl;
	}
	
	public void setGolVisi(int gv)
	{
		this.marcador[1] = gv;
	}
		
	public Jugador getGoleadoresLocales(int num)
	{
		return this.jugaLocal.get(num);
	}
	
	public Jugador getGoleadoresVisitantes(int num)
	{
		return this.jugaVisit.get(num);
	}
	
	public int tamanoJugaLocal()
	{
		return this.jugaLocal.size();
	}
	
	public int tamanoJugaVisit()
	{
		return this.jugaVisit.size();
	}

	public void determinarPartido()
	
	{
		int jj=equipos[0].getJj()+1;
		int jj2=equipos[1].getJj()+1;
		equipos[0].setJj(jj);
		equipos[1].setJj(jj2);
		
		if (marcador[0]>marcador[1]){	
			
			int jg=equipos[0].getJg()+1;
			int jp=equipos[1].getJp()+1;
			equipos[0].setJg(jg);
			equipos[1].setJp(jp);
			
		}
		else{
			if(marcador[0]<marcador[1]){
				int jg=equipos[1].getJg()+1;
				int jp=equipos[0].getJp()+1;
				equipos[1].setJg(jg);
				equipos[0].setJp(jp);
			}
			else
			{
				int je=equipos[0].getJe()+1;
				int je2=equipos[1].getJe()+1;
				equipos[0].setJe(je);
				equipos[1].setJe(je2);
				
			}
		}
		
		int gf=equipos[0].getGf()+marcador[0];
		int gf2=equipos[1].getGf()+marcador[1];
		int gc=equipos[0].getGc()+marcador[1];
		int gc2=equipos[1].getGc()+marcador[0];
		equipos[0].setGf(gf);
		equipos[1].setGf(gf2);
		equipos[0].setGc(gc);
		equipos[1].setGc(gc2);
	}
	
	
}
