package Ecosistemas;

public class Biotopo {
	public String nombre;

	public Biotopo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean sueloFertil(boolean fertil) {
		return fertil;
	}

}