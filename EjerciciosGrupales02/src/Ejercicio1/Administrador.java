package Ejercicio1;

public class Administrador extends Cliente {


	
	public Administrador(int numCuenta, String titularCuenta, double saldoCuenta, double interesAnualCuenta,
			boolean admin) {
		super(numCuenta, titularCuenta, saldoCuenta, interesAnualCuenta, admin);

	}




	public  void menuAdministrador() {
		
		String resultado;
		
		resultado = "----Menu Administrador----"+ "\nNumero de cuenta: " + this.getNumCuenta() + "\n"
				+ "Titular Cuenta: " + this.getTitularCuenta() + "\n"
				+ "Saldo Cuenta: " + this.getSaldoCuenta() + "\n" 
				+ "Inter�s anual de la cuenta" + this.getInteresAnualCuenta() +"\n"
				+ "Salir.";
		
		System.out.println(resultado);
	}
	
}
