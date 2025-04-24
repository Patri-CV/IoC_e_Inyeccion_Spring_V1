package Hotel.model;

public class Reserva {
	
	private int numeroHabitacion;
	private String horaReserva;
	private String fecha;
	private Persona cliente;
	
	// Constructor.
	public Reserva(int numeroHabitacion, String horaReserva, String fecha, Persona cliente) {
		super();
		this.numeroHabitacion = numeroHabitacion;
		this.horaReserva = horaReserva;
		this.fecha = fecha;
		this.cliente = cliente;
	}

	// ToString.
	@Override
	public String toString() {
		return "Reserva hecha por " + cliente.getNombre() + " " + cliente.getApellidos()
		+ " en la habitación " + numeroHabitacion + " a las " + horaReserva
		+ " en el " + fecha;
	}
	
	
}
