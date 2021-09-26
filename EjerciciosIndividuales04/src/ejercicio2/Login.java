package ejercicio2;

public class Login {

	private String usuario;
	private String contrase�a;
	
	public Login(String usuario, String contrase�a) {
		this.usuario = usuario;
		this.contrase�a = contrase�a;
	}

	public Login() {
	}


	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public boolean comprobarUsuario(String usuario, String contrase�a) {
		if((usuario.equals(this.usuario)) && (contrase�a.equals(this.contrase�a))) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
