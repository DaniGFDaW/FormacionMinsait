package ejer4;

import java.time.LocalDate;

public class Libro implements interfazPrestable {
	private int codigo;
	private String nombre;
	private LocalDate aņoPublicacion;
	private boolean prestado;

	public Libro(int codigo, String nombre, LocalDate aņoPublicacion, boolean prestado) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.aņoPublicacion = aņoPublicacion;
		this.prestado = prestado;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	@Override
	public String toString() {

		String dispo;

		if (isPrestado()) {
			dispo = "Si";
		} else {
			dispo = "No";
		}
		return "Libro con codigo: " + codigo + ", nombre: " + nombre + ", aņoPublicacion: " + aņoPublicacion
				+ ", disponiblidad: " + dispo;
	}

	@Override
	public void prestar() {
		setPrestado(false);
		System.out.println("El libro ha sido prestado");
	}

	@Override
	public void devolver() {
		setPrestado(true);
		System.out.println("El libro ha sido devuelto");
	}

	@Override
	public boolean prestado() {
		if (isPrestado() == true) {
			return true;
		} else {
			return false;
		}
	}

}
