package ejercicio5;

public class Principal {

	public static void main(String[] args) {

		System.out.println("------------------");
			Coche coche = new Coche();
			coche.numPuertas();
			coche.numRuedas();
			coche.tipoVehiculo();
		System.out.println("------------------");

		System.out.println("\n------------------");
			Avion avion = new Avion();
			avion.numPuertas();
			avion.numRuedas();
			avion.tipoVehiculo();
		System.out.println("------------------");

		System.out.println("\n------------------");
			Barco barco = new Barco();
			barco.numPuertas();
			barco.numRuedas();
			barco.tipoVehiculo();
		System.out.println("------------------");

	}

}
