package Ejercicio1;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		//Creo una administrador
		Scanner teclado = new Scanner(System.in);
		System.out.println("Numero Cuenta");
		int numCuenta = Integer.parseInt(teclado.nextLine());
		System.out.println("Titular Cuenta");
		String titularCuenta = teclado.nextLine();
		System.out.println("Saldo Cuenta");
		int saldoCuenta = Integer.parseInt(teclado.nextLine());
		System.out.println("Inter?s anual de la cuenta.");
		int interesAnualCuenta = Integer.parseInt(teclado.nextLine());
		System.out.println("Numero Cuenta (True o False)");
		Boolean admin = Boolean.parseBoolean(teclado.nextLine());
		teclado.close();
		if(admin == true){
		Administrador admin1 = new Administrador(numCuenta, titularCuenta, saldoCuenta,interesAnualCuenta,admin);
		admin1.menuAdministrador();
		}else if(admin == false) {
			Usuario usuario1 = new Usuario(numCuenta, titularCuenta, saldoCuenta,interesAnualCuenta,admin);
			usuario1.menuUsuario();
		}
		
	}

}
