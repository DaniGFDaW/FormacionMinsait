package ejer3;

import java.time.LocalDate;

public class Publicaciones {
	private String nombre;
	private LocalDate a�oPublicacion;
	private boolean prestado;
	
	public Publicaciones(String nombre, LocalDate a�oPublicacion, boolean prestado) {
		this.nombre = nombre;
		this.a�oPublicacion = a�oPublicacion;
		this.prestado = prestado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getA�oPublicacion() {
		return a�oPublicacion;
	}

	public void setA�oPublicacion(LocalDate a�oPublicacion) {
		this.a�oPublicacion = a�oPublicacion;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	
	
}
