package ejer5;

import java.util.NoSuchElementException;

public class Pila implements ColeccionInterfaz {

	private int pila[];
	private int contador = 0;
	private int capacidad;

	public Pila(int capacidad) {
		this.capacidad = capacidad;
		pila = new int[this.capacidad];
	}

	public int[] getPila() {
		return pila;
	}

	public void setPila(int[] pila) {
		this.pila = pila;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public void añadir(int numero) {
		if (this.contador <= this.capacidad) {
			pila[++contador] = numero;
		}
		System.out.println("\nSe ha añadido el numero" + numero + " a la pila");
	}

	@Override
	public boolean estaVacia() {
		if (getContador() < 0) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public void extraer() {
		if (estaVacia()) {
			throw new NoSuchElementException("\nLa pila esta vacia");
		} else {
			pila[contador] = --contador;
			System.out.println("\nNumero" +contador + " retirado");
		}
	}

	@Override
	public int primero() {

		if (estaVacia()) {
			throw new NoSuchElementException("\nLa pila esta vacia");
		} else {
			return pila[contador];
		}

	}

}
