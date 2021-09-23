package ejercicio3;

public class Oficial extends Operario{
	
	private String nivel;

	
	public Oficial() {
		
	}
	
	public Oficial(String nombre, String apellido1, String apellido2, String direccion, String fono, String email,
			String departamento, Double sueldo,String grado, String nivel) {
    	
    	super(nombre,apellido1,apellido2,direccion,fono,email,departamento,sueldo,grado);
       	this.nivel = nivel;                                                         
    }

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
	public void supervisar() {
		System.out.println("El oficial supervisa");
	}
}
