package ejercicio3;

public class Directivo extends Empleado{
	
		private String socio;
		
		
		public Directivo() {
			
		}
		
		public Directivo(String nombre, String apellido1, String apellido2, String direccion, String fono, String email,
				String departamento, Double sueldo, String socio) {
			super(nombre,apellido1,apellido2,direccion,fono,email,departamento,sueldo);
			this.socio = socio;
		}

		public String getSocio() {
			return socio;
		}

		public void setSocio(String socio) {
			this.socio = socio;
		}
		
		public void dirige() {
			System.out.println("El directivo dirige");
		}
		
		
}
