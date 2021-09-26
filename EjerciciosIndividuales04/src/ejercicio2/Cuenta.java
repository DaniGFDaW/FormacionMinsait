package ejercicio2;

public class Cuenta {

	private boolean admin;
	private int numCuenta;
	private String titular;
	private double saldo;
	private double interesAnual;
	
	public Cuenta(boolean admin, int numCuenta, String titular, double saldo, double interesAnual) {
		this.admin = admin;
		this.numCuenta = numCuenta;
		this.titular = titular;
		this.saldo = saldo;
		this.interesAnual = interesAnual;
	}

	public Cuenta() {
	
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getInteresAnual() {
		return interesAnual;
	}

	public void setInteresAnual(double interesAnual) {
		this.interesAnual = interesAnual;
	}
	
	
	public void depositarDinero(double ingreso) {
		System.out.println("Usted ha ingresado " + ingreso + "€\nEl saldo total de su cuenta asciende a " + (this.getSaldo() + ingreso) + "\nGracias por confiar en nosotros! :)\n");
	}
	
	public void sacarDinero(double retirar) {
		System.out.println("Usted ha retirado " + retirar + "€\nEl saldo total de su cuenta desciende a " + (this.getSaldo() - retirar) + "\nGracias por confiar en nosotros! :)\n");
	}
	
	public void conversionDivisa() {
		double divFinal = (this.getSaldo() * (double)1.17);
		System.out.println(this.getSaldo() + "€ son un total de: " + divFinal + "$");
	}
	
	
}
