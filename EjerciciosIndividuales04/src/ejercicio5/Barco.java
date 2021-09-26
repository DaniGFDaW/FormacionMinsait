package ejercicio5;

public class Barco implements Vehiculo {

	@Override
	public void numRuedas() {
		System.out.println("El barco no tiene ruedas");
	}

	@Override
	public void tipoVehiculo() {
		System.out.println("El avion es un vehiculo maritimo");
	}

	@Override
	public void numPuertas() {
		System.out.println("El avion tiene muchas puertas");		
	}
}
