package ejercicio3;

public class Operario extends Empleado{
	
	private String grado;
	
	public Operario() {
		super();
	}
	
	public Operario(String nombre, String apellido1, String apellido2, String direccion, String fono, String email,
			String departamento, Double sueldo,String grado) {
    	super(nombre,apellido1,apellido2,direccion,fono,email,departamento,sueldo);
    	this.grado = grado;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}
	
	public void operar() {
		System.out.println("El operario opera");
	}
	
	

}
