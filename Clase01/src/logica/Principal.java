package logica;

public class Principal {

	public static void main(String[] args) {
		
		String saludo = "Curso de Java";
		int numero = 1;
		double numeroG  = 23.341234321;
		
		
		System.out.println("Hellow world");
		System.out.println(saludo);
		System.out.println(numero);
		System.out.println(numeroG);
		
		System.out.println(saludo  + " - " + numero);
			
	//Operaciones Basicas
		 
		int num1 = 2;
		int num2 = 5;
		int suma;
		int resta;
		double division;
		int multiplicacion;		
	//Actividad 1
		
		System.out.println("\n"+"Suma");
		
		suma = num1 + num2;
		
		System.out.println(suma + "\n");
		
		
		System.out.println("Resta");
		
		resta = num2 - num1;
		
		System.out.println(resta + "\n");
		
		System.out.println("Division");
		
		division = num1 / num2;
		
		System.out.println(division + "\n");
		
		System.out.println("Multiplicacion");
		
		multiplicacion = num1 * num2;
		
		System.out.println(multiplicacion+ "\n");
		
		//Actividad 2 
		
		char let1 = 'D';
		char let2 = 'a';
		char let3 = 'n';
		char let4 = 'i';
		char let5 = 'e';
		char let6 = 'l';
		
		System.out.println("" + let1 + let2 + let3 + let4 + let5 + let6);

		
		//Actividad 3 
		
		float num3 = 6;
		float num4 = 8;
		float suma1;
		float resta1;
		float division1;
		float multiplicacion1;	
		
		System.out.println("\n"+"Suma");
		
		suma1 = num3 + num4;
		
		System.out.println(suma1 + "\n");
		
		
		System.out.println("Resta");
		
		resta1 = num3 - num4;
		
		System.out.println(resta1 + "\n");
		
		System.out.println("Division");
		
		division1 = num3 / num4;
		
		System.out.println(division1 + "\n");
		
		System.out.println("Multiplicacion");
		
		multiplicacion1 = num3 * num4;
		
		System.out.println(multiplicacion1+ "\n");
		
		//Modulo
		
		
		int nac = 28;
		int num5 = 2;
		int modulo = nac%num5;
		
		System.out.println(modulo);
		
		
		//Clases
		//Creacion o Instancia de una clase
		
		Persona per = new Persona("Daniel", 21);
		Persona per2 = new Persona();
		
		System.out.println(per.getEdad());
		System.out.println(per2);
		
	}

}
