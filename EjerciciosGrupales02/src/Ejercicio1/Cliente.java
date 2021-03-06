package Ejercicio1;

public class Cliente {
	private int numCuenta;
	private String titularCuenta;
	private double saldoCuenta;
	private double interesAnualCuenta;
	private boolean admin;
	
	public Cliente(int numCuenta, String titularCuenta, double saldoCuenta, double interesAnualCuenta,boolean admin) {
		super();
		this.numCuenta = numCuenta;
		this.titularCuenta = titularCuenta;
		this.saldoCuenta = saldoCuenta;
		this.interesAnualCuenta = interesAnualCuenta;
		this.admin = admin;
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

	public String getTitularCuenta() {
		return titularCuenta;
	}

	public void setTitularCuenta(String titularCuenta) {
		this.titularCuenta = titularCuenta;
	}

	public double getSaldoCuenta() {
		return saldoCuenta;
	}

	public void setSaldoCuenta(double saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}

	public double getInteresAnualCuenta() {
		return interesAnualCuenta;
	}

	public void setInteresAnualCuenta(double interesAnualCuenta) {
		this.interesAnualCuenta = interesAnualCuenta;
	}
	
	
	
}
