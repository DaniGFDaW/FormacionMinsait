package ejercicio3;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class ejer3 {

	public static void main(String[] args) {

	LocalDate fechaNacimiento = LocalDate.of(2000, 05, 28);
	LocalDate fechaActual = LocalDate.now();
		
		int dias = (int) DAYS.between(fechaNacimiento, fechaActual);
		System.out.println("Desde que naciste " + fechaNacimiento.toString() + " hasta hoy " + fechaActual.toString() + " hay: " + dias + " días");	

	}

}
