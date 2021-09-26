package ejercicio6;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	static Scanner teclado = new Scanner(System.in);
	static LinkedList<Cliente> listaClientes = new LinkedList<Cliente>();

	public static void main(String[] args) {
		añadirClientes();
		mostrarDatos();

	}

	public static void añadirClientes() {
		String opcion;
		int nClientes;

		System.out.println("¿Quieres añadir clientes (si/no)?");
		opcion = teclado.nextLine();
		if (opcion.toLowerCase().equals("si")) {
			System.out.println("¿Cuantos clientes quieres añadir?");
			nClientes = Integer.parseInt(teclado.nextLine());
			pedirDatos(nClientes);
		} else if (opcion.toLowerCase().equals("no")) {
			System.out.println("Saliendo........");
			System.exit(0);
		}
	}

	public static void pedirDatos(int numClientes) {
		String nombre, apellidos, mail;
		int telf;
		for (int i = 1; i <= numClientes; i++) {
			System.out.println("\n-----Cliente " + (i + 1) + "-----");
			System.out.println("Nombre del cliente:");
			nombre = teclado.nextLine();
			System.out.println("Apellidos del cliente:");
			apellidos = teclado.nextLine();
			System.out.println("Teléfono del cliente:");
			telf = Integer.parseInt(teclado.nextLine());
			System.out.println("Correo del cliente:");
			mail = teclado.nextLine();

			listaClientes.add(new Cliente(nombre, apellidos, telf, mail));
		}
	}

	public static void mostrarDatos() {
		System.out.println("-----------Datos Cliente-----------");
		for (int i = 0; i < listaClientes.size(); i++) {
			System.out.println("\n----Cliente " + (i + 1) + " ----");
			System.out.println("\nNombre: " + listaClientes.get(i).getNombre());
			System.out.println("\nApellidos: " + listaClientes.get(i).getApellidos());
			System.out.println("\nTeléfono: " + listaClientes.get(i).getTelf());
			System.out.println("\nCorreo: " + listaClientes.get(i).getEmail());
		}
	}

}
