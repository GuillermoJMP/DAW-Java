package modelo;

import java.time.LocalDateTime;

public class Mensaje {
	int id;
	LocalDateTime fechaHora;
	String mensaje;
	int persona_id;
	int ejemplar_id;

	public Mensaje(int id, LocalDateTime fechaHora, String mensaje, int persona_id, int ejemplar_id) {
		super();
		this.id = id;
		this.fechaHora = fechaHora;
		this.mensaje = mensaje;
		this.persona_id = persona_id;
		this.ejemplar_id = ejemplar_id;
	}

	public Mensaje() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public int getPersona_id() {
		return persona_id;
	}

	public void setPersona_id(int persona_id) {
		this.persona_id = persona_id;
	}

	public int getEjemplar_id() {
		return ejemplar_id;
	}

	public void setEjemplar_id(int ejemplar_id) {
		this.ejemplar_id = ejemplar_id;
	}

	@Override
	public String toString() {
		return "Mensaje [id=" + id + ", fechaHora=" + fechaHora + ", mensaje=" + mensaje + ", persona_id=" + persona_id
				+ ", ejemplar_id=" + ejemplar_id + "]";
	}

}
