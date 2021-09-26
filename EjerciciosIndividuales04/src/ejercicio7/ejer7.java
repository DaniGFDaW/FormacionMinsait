package ejercicio7;

import java.util.HashMap;
import java.util.Scanner;

public class ejer7 {

	static Scanner teclado = new Scanner(System.in);
	static HashMap <String, String> mapaPaisCapital = new HashMap<String, String>();
	
	public static void main(String[] args) {
		datosPaisesCapitales();
		mostarMapa();
	}
	
	public static void datosPaisesCapitales() {
		String pais, capital;
		for(int i = 0; i < 1; i++) {
			System.out.println("Escribe el Pais:");
			pais = teclado.nextLine();
			System.out.println("Escribe su capital:");
			capital = teclado.nextLine();
			mapaPaisCapital.put(pais, capital);
		}
	}
	
	public static void mostarMapa() {
		System.out.println(mapaPaisCapital);
		pedirClave();
	}
	
	public static void pedirClave() {
		String pais  = "";
		do{
			System.out.println("Escribe una pais para buscar su capital:");
			pais = teclado.nextLine();
			System.out.println("La capital de " + pais + " es: " + mapaPaisCapital.get(pais));
		}while(pais != "0");
	}
	

}
