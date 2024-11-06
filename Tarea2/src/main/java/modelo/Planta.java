package modelo;

public class Planta {
	int codigo;
	String nombreComun;
	String nombreCientifico;

	public Planta(int codigo, String nombreComun, String nombreCientifico) {
		super();
		this.codigo = codigo;
		this.nombreComun = nombreComun;
		this.nombreCientifico = nombreCientifico;
	}

	public Planta() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombreComun() {
		return nombreComun;
	}

	public void setNombreComun(String nombreComun) {
		this.nombreComun = nombreComun;
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	@Override
	public String toString() {
		return "Planta [codigo=" + codigo + ", nombreComun=" + nombreComun + ", nombreCientifico=" + nombreCientifico
				+ "]";
	}

}
