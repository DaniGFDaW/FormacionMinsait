package logica;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		//		ejr1();
		//		ejr2();
		//		ejr3();
		//		ejr4();
		//		ejr5();
		//		ejr6();
		//		ejr7();
		//		ejr8();
		//		ejr9();
		//		ejr10();
		//		ejr11();
		}	
	
	//Ejercicio 1. Pedir dos n?meros y decir si son iguales o no
	
	public static void ejr1() {
		System.out.println("Ejercicio 1");

		int num1;
		int num2;
	
		System.out.println("Dime el primer numero");
		num1 = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Dime el segundo numero");
		num2 = Integer.parseInt(teclado.nextLine());
	
		if(num1 == num2) {
			System.out.println("Los numeros son iguales");
		}else {
			System.out.println("Los numeros son diferentes");
		}
	}

	//Ejercicio 2. Pedir dos n?meros y decir cu?l es el mayor o si son iguales
	
	public static void ejr2() {
		int num3;
		int num4;
	
		System.out.println("Dime el primer numero");
		num3 = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Dime el segundo numero");
		num4 = Integer.parseInt(teclado.nextLine());
	
		if(num3 == num4) {
			System.out.println("Los numeros son iguales");
		}else if (num3 > num4){
			System.out.println("El numero " + num3 + " es mayor que " + num4);
		}else {
			System.out.println("El numero " + num4 + " es mayor que " + num3);
		}
	}

	//Ejercicio 3. Pedir tres n?meros y mostrarlos ordenados de mayor a menor
	
	public static void ejr3() {
		int num5;
		int num6;
		int num7;
		
		System.out.println("Dime el primer numero");
		num5 = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Dime el segundo numero");
		num6 = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Dime el tercer numero");
		num7 = Integer.parseInt(teclado.nextLine());
	
		if(num5 >= num6 && num6 >= num7) {
			System.out.println("Los numeros de mayor a menor son : " + num5 + " - " + num6 + " - " + num7) ;
		}else if (num5 >= num7 && num7 >= num6){
			System.out.println("Los numeros de mayor a menor son : " + num5 + " - " + num7 + " - " + num6);
		}else if (num6 >= num5 && num5 >= num7){
			System.out.println("Los numeros de mayor a menor son : " + num6 + " - " + num5 + " - " + num7);
		}else if (num6 >= num7 && num7 >= num5){
			System.out.println("Los numeros de mayor a menor son : " + num6 + " - " + num7 + " - " + num5);
		}else if (num7 >= num6 && num6 >= num5){
			System.out.println("Los numeros de mayor a menor son : " + num7 + " - " + num6 + " - " + num5);
		}else 
			System.out.println("Los numeros de mayor a menor son : " + num7 + " - " + num5 + " - " + num6);
		}
	
	//Ejercicio 4. Pedir una nota de 1 a 7 y mostrarla de la forma: Insuficiente(<=3.9), Suficiente(>4y<5.9), Bien(>6)
	
	public static void ejr4() {
		double nota;
		System.out.println("Dime tu nota (1-7)");
		nota = Double.parseDouble(teclado.nextLine());
		
		if( nota  > 0 && nota <=3.9 ) {
			System.out.println("Has sacado un insuficiente");
		}else if (nota >=3.9 && nota <= 5.9 ){
			System.out.println("Has sacado un suficiente");
		}else if (nota > 5.9 ) {
			System.out.println("Has sacado un Bien");
		}
	}
	
	//Ejercicio 5. Pedir dos fechas y mostrar el n?mero de d?as que hay de diferencia. Suponiendo todos los meses de 30 d?as
	
	public static void ejr5() {
		int fecha1, fecha2; 
		System.out.println("Introduce la primera fecha: \n DIA");
		fecha1 = teclado.nextInt();
		System.out.println("MES");
		fecha1 = fecha1 + (teclado.nextInt()-1)*30;
		System.out.println("A?O");
		fecha1 = fecha1 + teclado.nextInt()*365;
		
		System.out.println("Introduce la segunda fecha: \n DIA");
		fecha2 = teclado.nextInt();
		System.out.println("MES");
		fecha2 = fecha2 + (teclado.nextInt()-1)*30;
		System.out.println("A?O");
		fecha2 = fecha2 + teclado.nextInt()*365;
		
		System.out.println("Hay una diferencia de "+ (fecha2-fecha1) + " d?as.");
	}
	
	//Ejercicio 6. Leer un n?mero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un n?mero negativo
	
	public static void ejr6() {
		int numero =0 ;
		while(numero >= 0) {
			System.out.println("Escribe un numero");
			numero = Integer.parseInt(teclado.nextLine());
			int resultado = numero * numero ;
			
			System.out.println("Su cuadrado es " + resultado);
		}
	}
	
	//Ejercicio 7. Pedir 5 sueldos. Mostrar su suma y cuantos hay mayores de 2000?.
	
	public static void ejr7() {
		int sueldoTotal = 0;
		int contador = 0;
		
		for(int i = 0 ; i < 6 ; i++) {
			System.out.println("Introduce un sueldo");
			int sueldo = Integer.parseInt(teclado.nextLine());
			sueldoTotal = sueldoTotal + sueldo;
			
			if(sueldo >2000) {
				contador++;
			};
		}
	}
	
	//Ejercicio 8. Pide un n?mero (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho n?mero.
	
	public static void ejr8() {
		boolean contador = true;
		while(contador == true) {
			System.out.println("Introduce un numero entre el 1 y el 10");
			int numM = Integer.parseInt(teclado.nextLine());
			
			if(numM >= 1 && numM <= 10) {
				for (int i = 1 ; i <= 10; i++) {
					System.out.println(i + " x " + numM + " = " + i*numM);
				}
				contador = false;
			}else {
				System.out.println("El numero no esta entre 1 y 10 ");
			}
		}
	}
	
	//Ejercicio 9. Realiza detenidamente una traza al siguiente programa y muestra cual ser?a la salida por pantalla:

	public static void ejr9() {
		
		int i,j,suma;
		
		for(i = 1 ; i <= 4; i++ ) {
			for(j = 3 ; j >= 0 ; --j ) {
				suma = (i * 10) + j;
				System.out.println(suma);
			}
		}
	}
	
	/*Ejercicio 10. Pedir Usuario y Clave por teclado, comparar claveguardada con anterioridad. Si la clave y el usuario son
	correctas ingresar el men? que tenga la posibilidad de modificar la clave mostrando un mensaje ?Clave cambiada con ?xito?*/
	
	public static void ejr10() {
		String usuario = "Daniel";
		String clave = "123";
		String usuarioE;
		String claveE;
		System.out.println("Introduce el usuario");
		usuarioE = teclado.nextLine();
		System.out.println("Introduce la clave");
		claveE = teclado.nextLine();
		
			if (usuario.equals(usuarioE) && clave.equals(claveE)) {
				System.out.println("Introduce una nueva clave");
				String claveNueva  = teclado.nextLine();
				clave = claveNueva;
			}else {
				System.out.println("La clave o usuario no coincide");
			}
	}
	
	//Ejercicio 11. ?Cu?ntas veces se imprimir? el siguiente c?digo ?Hola Mundo??
	
	public static void ejr11() {
		int contador = 0;
		for(int i = 0; i < 10 ; i++) {
			i = i++; 
			System.out.println("Hola Mundo");
			contador++;
			
		}
		System.out.println(" \nSe ejecuta " + contador + " veces");
	}
	


}
	
	

	


