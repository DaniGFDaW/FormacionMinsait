package Ejercicio2;

public class Funcionario {
	
	private String RUT;
	private String Nombre;
	private String Apellidos;
	private String Domicilio;
	private String fechaNacimiento;
	private double sueldoBruto;
	
	public Funcionario(String rUT, String nombre, String apellidos, String domicilio, String fechaNacimiento, double sueldoBruto) {
		this.RUT = rUT;
		this.Nombre = nombre;
		this.Apellidos = apellidos;
		this.Domicilio = domicilio;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBruto = sueldoBruto;
	}

	public String getRUT() {
		return RUT;
	}
	public void setRUT(String rUT) {
		RUT = rUT;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public double getSueldoBruto() {
		return sueldoBruto;
	}
	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}
	public String getDomicilio() {
		return Domicilio;
	}
	public void setDomicilio(String domicilio) {
		Domicilio = domicilio;
	}
	public String getAtributos() {
		return this.RUT +" "+ this.Apellidos +" "+ this.Nombre +" "+ this.fechaNacimiento+" "+this.sueldoBruto;  
	}
}
