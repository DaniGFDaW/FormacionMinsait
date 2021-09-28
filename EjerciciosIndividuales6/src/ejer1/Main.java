package ejer1;

import java.util.Scanner;

public class Main {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Escribe la frase que quieres invertir");
		String fraseElegida = teclado.nextLine();
		
		System.out.println("La frase que has elegido es: " + fraseElegida);
		System.out.println("\nLa frase que has elegido invertida es: " + invertirFrase(fraseElegida));
	}

	public static String invertirFrase(String frase) {
		
		String[] frasePartes = frase.split(" ");
		String fraseNueva = "";
		for (int i = 1; i < frasePartes.length - 1; i++) {
			
			fraseNueva = fraseNueva + " " + frasePartes[i] ;
		}
		
		fraseNueva = frasePartes[frasePartes.length - 1] + " " + fraseNueva + " " + frasePartes[0];
		
		return fraseNueva; 
		
	}
}
