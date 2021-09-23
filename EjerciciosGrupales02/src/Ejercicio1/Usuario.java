package Ejercicio1;

public class Usuario extends Cliente{

	public Usuario(int numCuenta, String titularCuenta, double saldoCuenta, double interesAnualCuenta, boolean admin) {
		super(numCuenta, titularCuenta, saldoCuenta, interesAnualCuenta,admin);
	}

	public void menuUsuario() {
		
		String resultado;
		
		resultado = "\n----Menu Cliente----"
				+ "\nDepositar\n"
				+ "Girar\n"
				+ "Consulta Saldo\n" 
				+ "Convertir la moneda de Euro a USD\n"
				+ "Salir.";
		
		System.out.println(resultado);
	}
	


	
}
