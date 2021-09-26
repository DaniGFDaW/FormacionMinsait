package ejercicio5;

public class Avion implements Vehiculo {
	
	@Override
	public void numRuedas() {
		System.out.println("El avion tiene 2 ruedas");
	}

	@Override
	public void tipoVehiculo() {
		System.out.println("El avion es un vehiculo aereo");
	}

	@Override
	public void numPuertas() {
		System.out.println("El avion tiene 2 puertas");		
	}
}
