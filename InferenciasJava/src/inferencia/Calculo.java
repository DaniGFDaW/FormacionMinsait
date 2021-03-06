package inferencia;

public class Calculo {

	public static void main(String[] args) {
		
	//El var no se ocupa como una variable global, sino como una local dentro de un metodo
		
		var dato = "Hola";
		System.out.println(dato);
		
		// Al ser dos datos del mismo tipo los suma
		var num1 = 23.4;
		var num2 = 4;
		var suma1 = num1 + num2;
		System.out.println(suma1);
		
		//Concatena al ser dos tipos diferetes de datos
		var datos2 = "2";
		var datos3 = 4;
		System.out.println(datos2 + datos3);
		
		
	// El var deduce el tipo de datos
		
		
	//Calculo de operaciones basicas 
		
	var dato1 = "1";
	var dato2 = 3;
	var dato3 = 26.5;
	var dato4 = 'c';
	
	var suma = dato2 + dato3;
	System.out.println(suma);
	
	var resta = dato2 - dato3;
	System.out.println(resta);
	
	var mult = dato2  * dato3;
	System.out.println(mult);
	
	var div = dato3 / dato2;
	System.out.println(div);
	
	var per = dato3 % dato2;
	System.out.println(per);
	
	System.out.println("El tipo de dato de la variable dato1 es: " + dato1.getClass().getSimpleName());
	System.out.println("El tipo de dato de la variable dato1 es: " + ((Object)dato2).getClass().getSimpleName());
	System.out.println("El tipo de dato de la variable dato1 es: " + ((Object)dato4).getClass().getSimpleName());
	}

}
