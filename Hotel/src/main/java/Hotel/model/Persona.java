package Hotel.model;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private String numero;
	
	// Getters y Setters.
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	// Constructor.
	public Persona(String nombre, String apellidos, String numero) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.numero = numero;
	}
}
