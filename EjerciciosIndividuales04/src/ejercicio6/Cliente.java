package ejercicio6;

public class Cliente {
	
	private String nombre;
	private String apellidos;
	private int telf;
	private String email;
	
	public Cliente(String nombre, String apellidos, int telf, String email) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telf = telf;
		this.email = email;
	}

	public Cliente() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getTelf() {
		return telf;
	}

	public void setTelf(int telf) {
		this.telf = telf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	
	
	
}
