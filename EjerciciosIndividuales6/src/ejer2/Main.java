package ejer2;

import java.util.Scanner;

public class Main {

	private static String dni;
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Escribe el DNI que quieres validar");
		dni = teclado.nextLine();
		
		if (validar() == true) {
			System.out.println("El DNI es valido");
		}else {
			System.out.println("El DNI no es valido");
		}
	}



	public static boolean validar() {

		String letraMayuscula = ""; 

		if (dni.length() != 9 || Character.isLetter(dni.charAt(8)) == false) {
			return false;
		}

		letraMayuscula = (dni.substring(8)).toUpperCase();

		if (soloNumeros() == true && letraDNI().equals(letraMayuscula)) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean soloNumeros() {

		int i, j = 0;
		String numero = ""; 
							
		String miDNI = ""; 
		String[] listaNumeros = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

		for (i = 0; i < dni.length() - 1; i++) {
			numero = dni.substring(i, i + 1);

			for (j = 0; j < listaNumeros.length; j++) {
				if (numero.equals(listaNumeros[j])) {
					miDNI += listaNumeros[j];
				}
			}
		}

		if (miDNI.length() != 8) {
			return false;
		} else {
			return true;
		}
	}

	private static String letraDNI() {
		int miDNI = Integer.parseInt(dni.substring(0, 8));
		int resto = 0;
		String miLetra = "";
		String[] asignacionLetra = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S",
				"Q", "V", "H", "L", "C", "K", "E" };

		resto = miDNI % 23;

		miLetra = asignacionLetra[resto];

		return miLetra;
	}
}
