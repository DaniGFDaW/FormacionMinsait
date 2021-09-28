package ejer5;

public class Main {

	public static void main(String[] args) {
		
		Pila pila =  new Pila(5);
		
		pila.estaVacia();
		pila.añadir(1);
		if(pila.estaVacia()) {
			System.out.println("\nLa pila esta vacia");
		}else {
			System.out.println("\nLa pila no esta vacia");
		}
		
		System.out.println(pila.primero());
		pila.extraer();
	}

}
