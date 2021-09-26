package ejercicio5;

public class Coche implements Vehiculo {

	@Override
	public void numRuedas() {
		System.out.println("El coche tiene 4 ruedas");
	}

	@Override
	public void tipoVehiculo() {
		System.out.println("El coche es un vehiculo terrestre");
	}

	@Override
	public void numPuertas() {
		System.out.println("El coche tiene de 2 a 4 puertas");		
	}
}
