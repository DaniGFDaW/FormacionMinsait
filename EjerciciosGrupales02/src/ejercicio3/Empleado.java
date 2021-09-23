package ejercicio3;

public class Empleado {
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String direccion;
	private String fono;
	private String email;
	private String departamento;
	private Double sueldo;

	public Empleado(){
		
	}
	
	public Empleado(String nombre, String apellido1, String apellido2, String direccion, String fono, String email,
			String departamento, Double sueldo) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.direccion = direccion;
		this.fono = fono;
		this.email = email;
		this.departamento = departamento;
		this.sueldo = sueldo;
	}




	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido1() {
		return apellido1;
	}


	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}


	public String getApellido2() {
		return apellido2;
	}


	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getFono() {
		return fono;
	}


	public void setFono(String fono) {
		this.fono = fono;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public Double getSueldo() {
		return sueldo;
	}


	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	
	
	

}
