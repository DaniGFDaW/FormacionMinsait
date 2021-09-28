package ejer4;

import java.time.LocalDate;

public class Revista extends Libro{
	private int numero;

	public Revista(int codigo, String nombre, LocalDate añoPublicacion, boolean prestado, int numero) {
		super(codigo, nombre, añoPublicacion, prestado);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		String dispo;
		
		if (isPrestado()) {
			dispo = "Si";
		}else {
			dispo = "No";
		}
		return "Revista con codigo: " + getCodigo() + ", nombre: " + getNombre() + ", añoPublicacion: " + getAñoPublicacion() + ", disponiblidad: "
				+ dispo + " y numero: " + this.numero;
	}

	@Override
	public void prestar() {
		setPrestado(false);
		System.out.println("La revista ha sido prestada");
	}

	@Override
	public void devolver() {
		setPrestado(true);
		System.out.println("La revista ha sido devuelta");
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

