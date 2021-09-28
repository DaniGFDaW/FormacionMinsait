package ejer3;

import java.time.LocalDate;

public class Publicaciones {
	private String nombre;
	private LocalDate añoPublicacion;
	private boolean prestado;
	
	public Publicaciones(String nombre, LocalDate añoPublicacion, boolean prestado) {
		this.nombre = nombre;
		this.añoPublicacion = añoPublicacion;
		this.prestado = prestado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(LocalDate añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	
	
}
