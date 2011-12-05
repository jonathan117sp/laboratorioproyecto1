package Modelo;

public class Arbitro {

	private String cedula;
	private String nombre;
	private String apellido;
	private String fechanac;
	private int partidos;
	
	
	public Arbitro() {
		// TODO Auto-generated constructor stub
	}


	public Arbitro(String cedula, String nombre, String apellido,
			String fechanac, int partidos) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechanac = fechanac;
		this.partidos = partidos;
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


	public int getPartidos() {
		return partidos;
	}


	public void setPartidos(int partidos) {
		this.partidos=partidos;
	}

	
	
}
