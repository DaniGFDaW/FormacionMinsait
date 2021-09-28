package logica;

public class Operaciones {
	
	private InterfazCalculadora suma = (n, m) -> n+m;
	private InterfazCalculadora resta = (n, m) -> n-m;
	private InterfazCalculadora multiplicacion = (n, m) -> n*m;
	private InterfazCalculadora division = (n, m) -> n/m;

	public float sumar(float num1, float num2) {
		return suma.getNumeros(num1, num2);
	}
	public float restar(float num1, float num2) {
		return resta.getNumeros(num1, num2);
	}
	public float multiplicar(float num1, float num2) {
		return multiplicacion.getNumeros(num1, num2);
	}
	public float dividir(float num1, float num2) {
		return division.getNumeros(num1, num2);
	}
	

	
}
