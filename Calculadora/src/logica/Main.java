package logica;

import java.util.Scanner;

public class Main {

	static Scanner teclado = new Scanner(System.in);
	static int opcion;
	static float total, numero;
	static Operaciones o = new Operaciones();

	public static void main(String[] args) {
		mostrarMenu();
	}

	public static void mostrarMenu() {
		do {
			System.out.println("------Menu------" + "\n 1.Suma" + "\n 2.Resta" + "\n 3.Multiplicación"
					+ "\n 4.División" + "\n 5.Salir");

			opcion = Integer.parseInt(teclado.nextLine());
			elegirOperacion(opcion);
		} while ((opcion != 5) && (opcion <= 5));

	}

	public static void elegirOperacion(int opcion) {
		switch (opcion) {
		case 1:
			sumar();
			siguienteOperacion();
			break;
		case 2:
			restar();
			siguienteOperacion();
			break;
		case 3:
			multiplicar();
			siguienteOperacion();
			break;
		case 4:
			dividir();
			siguienteOperacion();
			break;

		}
	}

	public static void siguienteOperacion() {
		System.out.println("¿Desea hacer otra operación?(s/n):");
		String opcion = teclado.nextLine();
		if (opcion.toLowerCase().equals("s")) {
			mostrarMenu();
		} else {
			getTotal();
			System.exit(0);
		}

	}

	public static void getTotal() {
		System.out.println("El total  es " + total);
	}

	public static void sumar() {
		System.out.println("Escribe un numero el cual quieres para sumar:");
		try {
			numero = Float.parseFloat(teclado.nextLine());
		} catch (Exception e) {
			System.out.println("Error:" + e + "El texto que has introducido no es un numero intentelo de nuevo");
		}
		total = o.sumar(total, numero);
	}

	public static void restar() {
		System.out.println("Escribe un numero el cual quieres para restar:");
		try {
			numero = Float.parseFloat(teclado.nextLine());
		} catch (Exception e) {
			System.out.println("Error:" + e + "El texto que has introducido no es un numero intentelo de nuevo");
		}
		total = o.restar(total, numero);
	}

	public static void multiplicar() {
		System.out.println("Escribe un numero el cual quieres para multiplicar:");

		try {
			numero = Float.parseFloat(teclado.nextLine());
		} catch (Exception e) {
			System.out.println("Error:" + e + "El texto que has introducido no es un numero intentelo de nuevo" );
		}
		total = o.multiplicar(total, numero);

	}

	public static void dividir() {
		System.out.println("Escribe un numero el cual quieres para dividir:");
		try {
			numero = Float.parseFloat(teclado.nextLine());
		} catch (Exception e) {
			System.out.println("Error:" + e + "El texto que has introducido no es un numero intentelo de nuevo");
		}
		total = o.dividir(total, numero);

	}

}
