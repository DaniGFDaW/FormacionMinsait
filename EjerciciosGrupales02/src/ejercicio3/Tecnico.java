package ejercicio3;

public class Tecnico extends Operario{
	
	private String especialidad;

	public Tecnico() {
		super();
    }

	public Tecnico(String nombre, String apellido1, String apellido2, String direccion, String fono, String email,
			String departamento, Double sueldo,String grado, String especialidad) {
    	
    	super(nombre,apellido1,apellido2,direccion,fono,email,departamento,sueldo,grado);
       	this.especialidad = especialidad;                                                         
    }

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	public void repara() {
		System.out.println("El técnico repara");
	}
	
}
