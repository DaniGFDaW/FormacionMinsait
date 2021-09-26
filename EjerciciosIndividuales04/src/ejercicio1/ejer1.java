package ejercicio1;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		//Utilice la recursividad para sumar todos los números entre 7 y 15
		   Scanner sc = new Scanner(System.in);
	        int num;
	        do{
	           System.out.print("Introduce un numero entero >0 ");
	           num = sc.nextInt();
	        }while(num<=0);
	        System.out.println("Suma desde 7 hasta " + num + " = " + recursividad(num));
		
	}
	
	public static int recursividad(int num) {
        if (num == 7) { 
        	return 1;
        }else {
	        return num +recursividad(num-1);
        }
	}
}
