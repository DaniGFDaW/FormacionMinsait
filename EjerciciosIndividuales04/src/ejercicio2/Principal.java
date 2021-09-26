package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	static Scanner teclado = new Scanner(System.in);

	private static String usuario;
	private static String contraseña;

	private static Login login1 = new Login("DanielAdministrador", "123456");
	private static Login login2 = new Login("Maria", "1234");
	static Cuenta cuenta = new Cuenta();

	static ArrayList<Login> login = new ArrayList<Login>();

	// Main
	public static void main(String[] args) {
		login.add(login1);
		login.add(login2);
		iniciarSesion();
	}

	// Inicio Sesion
	public static void iniciarSesion() {
		do {

			System.out.println("Escribe un nombre de usuario: ");
			usuario = teclado.nextLine();

			System.out.println("Escribe la contraseña: ");
			contraseña = teclado.nextLine();

		} while (comprobarLogin(usuario, contraseña) == false);
		if (comprobarLogin(usuario, contraseña) == true) {
			System.out.println("Sesión iniciada correctamente");
			if (usuario.equals("DanielAdministrador")) {
				mostrarMenus("administrador");
			} else if (usuario.equals("cliente")) {
				mostrarMenus("Maria");
			}

		} else {
			System.out.println("Error al iniciar la sesión! Usuario/Contraseña incorrectos");
		}
	}

	
	// Comprobar Login
		public static boolean comprobarLogin(String usuario, String contraseña) {
			boolean log = false;

			for (int i = 0; i < login.size(); i++) {
				if ((usuario.equals(login.get(i).getUsuario())) && (contraseña.equals(login.get(i).getContraseña()))) {
					log = true;
				}
			}
			return log;
		}
	
	
	// Menus
	public static void mostrarMenus(String tipoUsu) {
		switch (tipoUsu) {
		case "administrador":
			crearObjetoCuenta(true, 43252345, "Daniel", 5242352, 3);
			System.out.println("\n******Menu Administrador******" + "\n1-Número de cuenta" + "\n2-Titular de la cuenta"
					+ "\n3-Saldo de la cuenta" + "\n4-Interés anual de la cuenta" + "\n5-Crear más cuentas"
					+ "\n6-Salir");
			opcionMenu(true);
			break;
		case "cliente":
			crearObjetoCuenta(false, 23435643, "Maria", 1231112, 8);
			System.out.println("\n----Menu Cliente----" + "\n1-Depositar" + "\n2-Retirar" + "\n3-Consulta saldo"
					+ "\n4-Convertir la moneda de € a USD" + "\n5-Crear más cuentas" + "\n6-Salir");
			opcionMenu(false);
			break;
		}
	}

	// Crear Cuenta
	public static void crearObjetoCuenta(boolean tipoUsu, int numCuenta, String titularCuenta, double saldoCuenta,
			double interesAnual) {
		cuenta.setAdmin(tipoUsu);
		cuenta.setNumCuenta(numCuenta);
		cuenta.setTitular(titularCuenta);
		cuenta.setSaldo(saldoCuenta);
		cuenta.setInteresAnual(interesAnual);
	}

	// Menu dependiendo si el usuario es adminstrador o un cliente normal
	public static void opcionMenu(boolean tipoUsu) {
		int opcion;
		double cantidad;

		if (tipoUsu == true) {
			System.out.println("\nElige una opción (1-6):");
			String opcionString = teclado.nextLine();
			opcion = Integer.parseInt(opcionString);

			if ((opcion > 0) && (opcion < 7)) {
				switch (opcion) {
				case 1:
					System.out.println("El número de cuenta es: " + cuenta.getNumCuenta());
					opcionMenu(tipoUsu);
					break;
				case 2:
					System.out.println("El titular de la cuenta es: " + cuenta.getTitular());
					opcionMenu(tipoUsu);
					break;
				case 3:
					System.out.println("El saldo de la cuenta es: " + cuenta.getSaldo() + "€");
					opcionMenu(tipoUsu);
					break;
				case 4:
					System.out.println("El interés anual de la cuenta es: " + cuenta.getInteresAnual());
					opcionMenu(tipoUsu);
					break;
				case 5:
					System.out.println("¿Cuantas cuentas quieres crear?");
					String nCuentas = teclado.nextLine();
					crearCuentas(Integer.parseInt(nCuentas));
					break;
				case 6:
					System.exit(1);
					break;
				default:
					System.out.println("Esa opción no es valida. Prueba de nuevo:");
					opcionMenu(tipoUsu);
					break;
				}
			} else {
				System.out.println("Esa opción no es valida. Prueba de nuevo:");
				opcionMenu(tipoUsu);
			}

		} else if (tipoUsu == false) {
			System.out.println("Elige una opción (1-6):");
			String opcionString = teclado.nextLine();
			opcion = Integer.parseInt(opcionString);
			if ((opcion > 0) && (opcion < 7)) {
				switch (opcion) {
				case 1:
					System.out.println("\n¿Cuanta cantidad de dinero quieres depositar en la cuenta?");
					cantidad = Double.parseDouble(teclado.nextLine());
					cuenta.depositarDinero(cantidad);
					opcionMenu(tipoUsu);
					break;
				case 2:
					System.out.println("\n¿Cuanta cantidad de dinero quieres sacar de la cuenta?");
					cantidad = Double.parseDouble(teclado.nextLine());
					cuenta.sacarDinero(cantidad);
					opcionMenu(tipoUsu);
					break;
				case 3:
					System.out.println("El saldo de la cuenta es: " + cuenta.getSaldo() + "€");
					opcionMenu(tipoUsu);
					break;
				case 4:
					cuenta.conversionDivisa();
					opcionMenu(tipoUsu);
					break;
				case 5: {
					System.exit(1);
					break;
				}
				default:
					System.out.println("Esa opción no es valida. Prueba de nuevo:");
					opcionMenu(tipoUsu);
					break;
				}
			} else {
				System.out.println("Esa opción no es valida. Prueba de nuevo:");
				opcionMenu(tipoUsu);
			}

		}
	}


	// Crear Cuenta
	public static void crearCuentas(int numCuentas) {
		String user, pass;
		for (int i = 0; i < numCuentas; i++) {
			System.out.println("---Cuenta numero " + (i + 1) + "---");
			System.out.println("Nombre de usuario:");
			user = teclado.nextLine();
			System.out.println("Contraseña :");
			pass = teclado.nextLine();
			login.add(new Login(user, pass));
		}
		leerCuentas();
	}

	// Mostrar Cuenta
	public static void leerCuentas() {
		for (int i = 0; i < login.size(); i++) {
			System.out.println("\n---Cuenta numero " + (i + 1) + "---");
			System.out.println("Nombre de usuario: " + login.get(i).getUsuario());
			System.out.println("Contraseña: " + login.get(i).getContraseña());
		}
	}

}
