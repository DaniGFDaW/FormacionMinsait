package ejercicio2;

public class Login {

	private String usuario;
	private String contraseña;
	
	public Login(String usuario, String contraseña) {
		this.usuario = usuario;
		this.contraseña = contraseña;
	}

	public Login() {
	}


	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public boolean comprobarUsuario(String usuario, String contraseña) {
		if((usuario.equals(this.usuario)) && (contraseña.equals(this.contraseña))) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
