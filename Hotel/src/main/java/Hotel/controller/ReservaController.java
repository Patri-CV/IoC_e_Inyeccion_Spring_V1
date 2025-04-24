package Hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import Hotel.model.Persona;
import Hotel.service.ReservaService;

@Component
public class ReservaController {
	
	private final ReservaService service;
	
	@Autowired
	public ReservaController(ReservaService ReservaService) {
		this.service = ReservaService;
	}
	
	public void ejecutar() {
		// Se crean clientes de ejemplo con los que se trabajarán.
		Persona per1 = new Persona("Maria", "Gomez", "123456789");
		Persona per2 = new Persona("José", "Torres", "987654321");
		
		// Se crean las reservas de habitaciones correspondientes con los clientes creados anteriormente.
		service.crearReserva(010, "08:18", "20/03/2025", per1);
		service.crearReserva(334, "12:04", "23/05/2025", per2);
		
		System.out.println("\nReservas actuaes: ");
		service.listarReservas().forEach(System.out::println);
	}

}
