package ejer3;

import java.time.LocalDate;

public class Publicaciones {
	private String nombre;
	private LocalDate aņoPublicacion;
	private boolean prestado;
	
	public Publicaciones(String nombre, LocalDate aņoPublicacion, boolean prestado) {
		this.nombre = nombre;
		this.aņoPublicacion = aņoPublicacion;
		this.prestado = prestado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getAņoPublicacion() {
		return aņoPublicacion;
	}

	public void setAņoPublicacion(LocalDate aņoPublicacion) {
		this.aņoPublicacion = aņoPublicacion;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	
	
}
