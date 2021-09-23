package logica;

public class Docente extends Persona {

	private int notaMatematicas;
	private int notaBiologia;
	private int notaFisica;
	private int notaQuimica;
	
	private int sueldoDia;
	private  int diasTrabajados;
	

	public Docente(String nombre, int edad, int notaMatematicas, int notaBiologia, int notaFisica, int notaQuimica,
			int sueldoDia, int diasTrabajados) {
		super(nombre, edad);
		this.notaMatematicas = notaMatematicas;
		this.notaBiologia = notaBiologia;
		this.notaFisica = notaFisica;
		this.notaQuimica = notaQuimica;
		this.sueldoDia = sueldoDia;
		this.diasTrabajados = diasTrabajados;
	}



	public int getNotaMatematicas() {
		return this.notaMatematicas;
	}



	public void setNotaMatematicas(int notaMatematicas) {
		this.notaMatematicas = notaMatematicas;
	}



	public int getNotaBiologia() {
		return this.notaBiologia;
	}



	public void setNotaBiologia(int notaBiologia) {
		this.notaBiologia = notaBiologia;
	}



	public int getNotaFisica() {
		return this.notaFisica;
	}



	public void setNotaFisica(int notaFisica) {
		this.notaFisica = notaFisica;
	}



	public int getNotaQuimica() {
		return this.notaQuimica;
	}



	public void setNotaQuimica(int notaQuimica) {
		this.notaQuimica = notaQuimica;
	}



	public int getSueldoDia() {
		return sueldoDia;
	}



	public void setSueldoDia(int sueldoDia) {
		this.sueldoDia = sueldoDia;
	}



	public int getDiasTrabajados() {
		return diasTrabajados;
	}



	public void setDiasTrabajados(int diasTrabajados) {
		this.diasTrabajados = diasTrabajados;
	}



	public void imprimir() {
		
		System.out.println("Nombre: " + this.getNombre() + "\nEdad: " + this.getEdad()
		+ "\nNota Media Matematicas de todos los alumnos: " + this.getNotaMatematicas()
		+ "\nNota Media Biologia de todos los alumnos: " + this.getNotaBiologia()
		+ "\nNota Media Fisica de todos los alumnos: " + this.getNotaFisica()
		+ "\nNota Media Quimica de todos los alumnos: " + this.getNotaQuimica()
		+ "\nNota Media Curso de todos los alumnos: " + calcularNotaMediaAlumnado()
		+ "\nSueldo : " + calcularSueldoTotal() + "€");
		
		
	}
	
	public int calcularNotaMediaAlumnado(){
		
		 int notaMedia;
		 
		 notaMedia = (this.notaMatematicas + this.notaBiologia + this.notaFisica + this.notaQuimica)/4 ;
		
		return notaMedia;
	}
	
	public int calcularSueldoTotal() {
		
		int total = this.sueldoDia * this.diasTrabajados;
		
		return total;
	}
}
