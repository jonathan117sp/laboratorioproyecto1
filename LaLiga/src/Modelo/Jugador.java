package Modelo;

public class Jugador {

	private String cedula;
	private String nombre;
	private String apellido;
	private String fechanac;
	private String posicion;
	private int goles;
	
	
	public Jugador() {
		// TODO Auto-generated constructor stub
	}


	public Jugador(String cedula, String nombre, String apellido,
			String fechanac, String posicion, int goles) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechanac = fechanac;
		this.posicion = posicion;
		this.goles = goles;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getFechanac() {
		return fechanac;
	}


	public void setFechanac(String fechanac) {
		this.fechanac = fechanac;
	}


	public String getPosicion() {
		return posicion;
	}


	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}


	public int getGoles() {
		return goles;
	}


	public void setGoles(int goles) {
		this.goles=goles;
	}
    
	
	
}
