package ejer4;

import java.time.LocalDate;

public class Libro implements interfazPrestable {
	private int codigo;
	private String nombre;
	private LocalDate a�oPublicacion;
	private boolean prestado;

	public Libro(int codigo, String nombre, LocalDate a�oPublicacion, boolean prestado) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.a�oPublicacion = a�oPublicacion;
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

	@Override
	public String toString() {

		String dispo;

		if (isPrestado()) {
			dispo = "Si";
		} else {
			dispo = "No";
		}
		return "Libro con codigo: " + codigo + ", nombre: " + nombre + ", a�oPublicacion: " + a�oPublicacion
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
