package modelo;

public class Credenciales {
	int id;
	String usuario;
	String password;
	int fk_persona;

	public Credenciales(int id, String usuario, String password, int fk_persona) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.password = password;
		this.fk_persona = fk_persona;
	}

	public Credenciales() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getFk_persona() {
		return fk_persona;
	}

	public void setFk_persona(int fk_persona) {
		this.fk_persona = fk_persona;
	}

	@Override
	public String toString() {
		return "Credenciales [id=" + id + ", usuario=" + usuario + ", password=" + password + ", fk_persona="
				+ fk_persona + "]";
	}

}
