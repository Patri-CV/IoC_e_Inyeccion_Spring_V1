package Hotel.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import Hotel.model.*;

@Service
public class ReservaService {
	
	private final List<Reserva> reservas = new ArrayList<Reserva>();
	
	public void crearReserva(int habitacion, String hora, String fecha, Persona cliente) {
		Reserva res = new Reserva(habitacion, hora, fecha, cliente);
		System.out.println("Se ha creado una reserva: " + res);
		reservas.add(res);
	}
	
	public List<Reserva> listarReservas() {
		return reservas;
	}
}
