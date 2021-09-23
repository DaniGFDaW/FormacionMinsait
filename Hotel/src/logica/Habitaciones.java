package logica;

public class Habitaciones {
	
	private int dias;
	private float valorDias;
	
	public Habitaciones() {

	}

	public int getDias() {
		return this.dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public float getValorDias() {
		return this.valorDias;
	}

	public void setValorDias(float valorDias) {
		this.valorDias = valorDias;
	}
	
	//Imprimir datos Habitacion
	
	public void imprimirDatosHabitacion() {
		System.out.println("\n----Datos Habitacion----");
		System.out.println("Total dias: " + this.dias);
		System.out.println("Valor por noche: " + this.valorDias + "€");
		System.out.println("Coste total: " + calculoTotal());
	}
	
	//Metodo calculo total por la habitacion
	
	public float  calculoTotal() {
		
		float total;
		
		total  = this.dias * this.valorDias;
		
		return total;
	}
	
	
}
