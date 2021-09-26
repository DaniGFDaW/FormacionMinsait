package ejercicio8;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ejer8 {

	public static void main(String[] args) throws ParseException {
		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("Introduce la primera fecha(yyyy-MM-dd)");
		Date fecha1 = (Date) format.parse(teclado.nextLine());
		System.out.println("Introduce la segunda fecha(yyyy-MM-dd)");
		Date fecha2 = (Date) format.parse(teclado.nextLine());
		
		if (fecha1.after(fecha2)) {
			System.out.println("La fecha: "+ fecha1 +" es despues " + fecha2);

		}else {
			System.out.println("La fecha: "+ fecha2 +" es despues " + fecha1);

		}
	}

}
