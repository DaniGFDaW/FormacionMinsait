package logica;

public class Main {

	public static void main(String[] args) {

		
		Cliente cliente1 = new Cliente("Daniel",21,"23864829J",2000);
		Habitaciones habitacion1 = new Habitaciones();
		
		habitacion1.setDias(2);
		habitacion1.setValorDias(10.5f);
		
		//Primera forma de mostar los datos por pantalla
		
		String resultado = "El cliente " + cliente1.getNombre() + " con DNI: " 
				+ cliente1.getId() + " de edad " + cliente1.getEdad() + 
				" años y con " + cliente1.getDineroDisponible() + "€ de dinero disponible ha alquilado la habitacion " 
				+ habitacion1.getDias() + " dias por " + habitacion1.getValorDias() + "€ el dia";
 		
		System.out.println(resultado);
		
		//Segunda forma de mostar los datos por pantalla mediante  metodos dentro de cada clase

		cliente1.imprimirCliente();
		
		habitacion1.imprimirDatosHabitacion();
		
		cliente1.dineroRestante(habitacion1.calculoTotal());
	}

}
