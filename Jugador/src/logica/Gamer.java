package logica;

public class Gamer {
	
	private String nombre;
	private int nivel;
	private char sexo;
	
	
	public Gamer(String nombre, int nivel, char sexo) {
		this.nombre = nombre;
		this.nivel = nivel;
		this.sexo = sexo;
	}
	
	public Gamer() {
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNivel() {
		return this.nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public char getSexo() {
		return this.sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	
}
