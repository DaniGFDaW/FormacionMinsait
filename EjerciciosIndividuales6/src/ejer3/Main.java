package ejer3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {

	
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		

		
		ArrayList<Publicaciones>listaLibros = new ArrayList<Publicaciones>();
		listaLibros.add(new Publicaciones("El italiano",LocalDate.parse("2021-09-21"),true));
		listaLibros.add(new Publicaciones("Los vencejos",LocalDate.parse("2021-08-25"),false));
		listaLibros.add(new Publicaciones("De ninguna parte",LocalDate.parse("2021-08-26"),true));
		
		ArrayList<Publicaciones>listaRevistas = new ArrayList<Publicaciones>();
		listaRevistas.add(new Publicaciones("La revista Publicaciones de la Facultad de Educación y Humanidades",LocalDate.parse("2021-03-27"),true));
		listaRevistas.add(new Publicaciones("Accion contra el hambre",LocalDate.parse("2021-06-05"),false));
		listaRevistas.add(new Publicaciones("Cruz Roja",LocalDate.parse("2020-01-17"),true));
		
		mostrarMenu(listaRevistas,listaLibros);
		
	}

	
	public static void mostrarMenu(ArrayList<Publicaciones>listaLibros,ArrayList<Publicaciones>listaRevistas) {
		int opcionM;
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
		 LocalDate añoElegido;
		do {
			System.out.println("\n------Menu------" + "\n 1.Saber Libros Prestado" + "\n 2.Libros Fecha anterior" + "\n 3.Saber Revistas Prestadas"
					+ "\n 4.Revistas Frecha anterior" + "\n 5.Salir");

			opcionM = Integer.parseInt(teclado.nextLine());
			switch (opcionM) {
			case 1:
				System.out.println("Hay " + saldoPrestados(listaLibros) + " libros prestados");
				break;
			case 2:
				System.out.println("Elige el año(2012-05-23)");
				añoElegido = LocalDate.parse(teclado.nextLine(),formatter);
				System.out.println("\nHay " + cantPublicaciones(listaLibros,añoElegido) + " revistas antes del año " + añoElegido );
				break;
			case 3:
				System.out.println("Hay " + saldoPrestados(listaRevistas) + " revistas prestadas");
				break;
			case 4:
				System.out.println("Elige el año(2012-05-23)");
				añoElegido = LocalDate.parse(teclado.nextLine(),formatter);
				System.out.println("\nHay " + cantPublicaciones(listaRevistas,añoElegido) + " revistas antes del año " + añoElegido );
				break;
			case 5:
				System.out.println("\nSaliendo.......");
				break;
			default:
				break;
			}
		} while ((opcionM != 5) && (opcionM <= 5));

	}


	
	public static int saldoPrestados(ArrayList<Publicaciones>listaPublicaciones) {
		int contadorPre = 0;
		
		for (Publicaciones publicaciones : listaPublicaciones) {
			if (publicaciones.isPrestado() == true) {
				contadorPre++;
			}
		}
		return contadorPre;
	}
	
	public static int cantPublicaciones(ArrayList<Publicaciones>listaPublicaciones, LocalDate año) {
		int contadorAño = 0;
		
		for (Publicaciones publicaciones : listaPublicaciones) {
			if (publicaciones.getAñoPublicacion().isBefore(año)) {
				contadorAño++;
			}
		}
		return contadorAño;
	}
}
