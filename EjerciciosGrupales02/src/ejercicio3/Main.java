package ejercicio3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado e1  = new Empleado("Nombre1","Apellido1","Apellido2","Desengaño 21","666666666","nombre@gmail.com","Ventas",15000.0);
		Directivo d1 = new Directivo("Nombre2","Apellido1","Apellido2","Desengaño 21","666666666","nombre@gmail.com","Ventas",15000.0,"Socio 3");
		Operario op1 = new Operario("Nombre3","Apellido1","Apellido2","Desengaño 21","666666666","nombre@gmail.com","Ventas",15000.0,"Grado 3");
		Oficial of1 = new Oficial("Nombre4","Apellido1","Apellido2","Desengaño 21","666666666","nombre@gmail.com","Ventas",15000.0,"Grado 3","Nivel 3");
		Tecnico t1 = new Tecnico("Nombre4","Apellido1","Apellido2","Desengaño 21","666666666","nombre@gmail.com","Ventas",15000.0,"Grado 3","Especialidad Java");
		
		System.out.println(e1.getSueldo());
		d1.dirige();
		op1.operar();
		of1.supervisar();
		t1.repara();
	}
	
}
