package ejer4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner teclado = new Scanner(System.in);
	static ArrayList<Libro> listaLibros = new ArrayList<Libro>();
	static ArrayList<Revista> listaRevistas = new ArrayList<Revista>();

	public static void main(String[] args) {
		listaLibros.add(new Libro(1, "El italiano", LocalDate.parse("2021-09-21"), true));
		listaLibros.add(new Libro(2, "Los vencejos", LocalDate.parse("2021-08-25"), false));
		listaLibros.add(new Libro(3, "De ninguna parte", LocalDate.parse("2021-08-26"), true));

		listaRevistas.add(new Revista(1, "La revista Publicaciones de la Facultad de Educación y Humanidades",
				LocalDate.parse("2021-03-27"), true, 41));
		listaRevistas.add(new Revista(2, "Accion contra el hambre", LocalDate.parse("2021-06-05"), false, 43));
		listaRevistas.add(new Revista(3, "Cruz Roja", LocalDate.parse("2020-01-17"), true, 42));

		mostrarMenuPrincipal();

	}

	public static void mostrarMenuPrincipal() {
		int opcionM = 0, opcionElegida;
		String menu = " ";
		System.out.println("\n------Menu------" + "\n 1.Libros " + "\n 2.Revistas" + "\n 3.Salir");
		opcionM = Integer.parseInt(teclado.nextLine());
		switch (opcionM) {
		case 1:
			menu = "Libros Disponibles: ";
			for (Libro libro : listaLibros) {
				menu = menu + "\n" + libro.toString();
			}
			menu = menu + "\nEliga el codigo de libro que quiere modificar";
			break;
		case 2:
			menu = "Revistas Disponibles: ";
			for (Revista revista : listaRevistas) {
				menu = menu + "\n" + revista.toString();
			}
			menu = menu + "\nEliga el codigo de revista que quiere modificar";
			break;
		case 3:
			System.out.println("\nSaliendo.......");
			break;
		default:
			break;
		}

		System.out.println(menu);
		opcionElegida = Integer.parseInt(teclado.nextLine());

		if (opcionM == 1) {
			mostrarMenuLibro(opcionElegida);
		} else if (opcionM == 2) {
			mostrarMenuRevista(opcionElegida);
		}
	}

	public static void mostrarMenuLibro(int codigo) {
		Libro libroElegido;
		int opcionM;
		for (Libro lib : listaLibros) {
			if (lib.getCodigo() == codigo) {
				libroElegido = lib;
				do {
					System.out.println("\n------Menu Libro------" + "\n 1.Prestar Libro" + "\n 2.Devolver Libro"
							+ "\n 3.Saber si el libro esta disponible" + "\n 4.Volver al menu anterior" + "\n 5.Salir");

					opcionM = Integer.parseInt(teclado.nextLine());
					switch (opcionM) {
					case 1:
						libroElegido.prestar();
						break;
					case 2:
						libroElegido.devolver();
						break;
					case 3:

						if (libroElegido.prestado() == true) {
							System.out.println("El libro no esta disponible");
						} else {
							System.out.println("El libro  esta disponible");
						}
						;
						break;
					case 4:
						mostrarMenuPrincipal();
						break;
					case 5:
						System.out.println("\nSaliendo.......");
						break;
					default:
						break;
					}
				} while ((opcionM != 5) && (opcionM <= 5));

			} 

		}

	}

	public static void mostrarMenuRevista(int codigo) {
		Revista revistaElegida;
		int opcionM;
		for (Revista rev : listaRevistas) {
			if (rev.getCodigo() == codigo) {
				revistaElegida = rev;
				do {
					System.out.println("\n------Menu Revista------" + "\n 1.Prestar Revista" + "\n 2.Devolver Revista"
							+ "\n 3.Saber si la revista esta disponible" + "\n 4.Volver al menu anterior"
							+ "\n 5.Salir");

					opcionM = Integer.parseInt(teclado.nextLine());
					switch (opcionM) {
					case 1:
						revistaElegida.prestar();
						break;
					case 2:
						revistaElegida.devolver();
						break;
					case 3:
						if (revistaElegida.prestado()) {
							System.out.println("El libro no esta disponible");
						} else {
							System.out.println("El libro  esta disponible");
						}
						;
					case 4:
						mostrarMenuPrincipal();
						break;
					case 5:
						System.out.println("\nSaliendo.......");
						break;
					default:
						break;
					}
				} while ((opcionM != 5) && (opcionM <= 5));
			} 

		}

	}

}
