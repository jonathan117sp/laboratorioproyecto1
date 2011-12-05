package Modelo;
import java.util.ArrayList;

public class Equipo {

	private String codigo;
	private String nombre;
	private float año;
	private String ciudad;
	private String estadio;
	private int jj;
	private int jg;
	private int je;
	private int jp;
	private int gf;
	private int gc;
	private ArrayList<Jugador> jugadores;
	
	
	public Equipo() {
		// TODO Auto-generated constructor stub
	}


	public Equipo(String codigo, String nombre, float año, String ciudad,
			String estadio, int jj, int jg, int je, int jp, int gf,
			int gc) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.año = año;
		this.ciudad = ciudad;
		this.estadio = estadio;
		this.jj = jj;
		this.jg = jg;
		this.je = je;
		this.jp = jp;
		this.gf = gf;
		this.gc = gc;
		this.jugadores = new ArrayList<Jugador>();
		
		
	}
	
	public int calcularPts()
	{
		return (jg*3)+(je*1);
		
	}

    public void agregarJugadores(Jugador jugador)
    {
    	this.jugadores.add(jugador);
    }
    								
    
	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public float getAño() {
		return año;
	}


	public void setAño(float año) {
		this.año = año;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getEstadio() {
		return estadio;
	}


	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}


	public int getJj() {
		return jj;
	}


	public void setJj(int jj) {
		this.jj = jj;
	}


	public int getJg() {
		return jg;
	}


	public void setJg(int jg) {
		this.jg = jg;
	}


	public int getJe() {
		return je;
	}


	public void setJe(int je) {
		this.je = je;
	}


	public int getJp() {
		return jp;
	}


	public void setJp(int jp) {
		this.jp = jp;
	}

	public int getGf() {
		return gf;
	}


	public void setGf(int gf) {
		this.gf = gf;
	}


	public int getGc() {
		return gc;
	}


	public void setGc(int gc) {
		this.gc = gc;
	}
	
	public void agregarJugador(Jugador jugador){
		this.jugadores.add(jugador);
	}

	public ArrayList<Jugador> getJugador()
	{
		return jugadores;
		
	}
	
}
