package modelo;

public class Ejemplar {

	int id;
	String nombre;
	int codigoPlanta;

	public Ejemplar(int id, String nombre, int codigoPlanta) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.codigoPlanta = codigoPlanta;
	}

	public Ejemplar() {
		super();
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Ejemplar [id=" + id + ", nombre=" + nombre + ", codigoPlanta=" + codigoPlanta + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigoPlanta() {
		return codigoPlanta;
	}

	public void setCodigoPlanta(int codigoPlanta) {
		this.codigoPlanta = codigoPlanta;
	}

}
