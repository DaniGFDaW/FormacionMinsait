package logica;

public class Principal {

	public static void main(String[] args) {
		
		Gamer gamer1 = new Gamer("Daniel",1,'M');
		Gamer gamer2 = new Gamer();
		Gamer gamer3 = new Gamer();

		gamer2.setNombre("Maria");
		gamer2.setNivel(2);
		gamer2.setSexo('F');
		
		gamer3.setNombre("Alex");
		gamer3.setNivel(3);
		gamer3.setSexo('D');
		
		String resultado = " Gamer 1 - Nombre: " + gamer1.getNombre() + " Nivel: "
				+ gamer1.getNivel() + " Sexo: " + gamer1.getSexo() + 
				"\n Gamer 2 - Nombre: " + gamer2.getNombre() + " Nivel: "
				+ gamer2.getNivel() + " Sexo: " + gamer2.getSexo() +
				"\n Gamer 3 - Nombre: " + gamer3.getNombre() + " Nivel: "
				+ gamer3.getNivel() + " Sexo: " + gamer3.getSexo();
		
		System.out.println(resultado);
	}

}
