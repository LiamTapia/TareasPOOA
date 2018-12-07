package Ecosistemas;

public class Plantae extends Reinos {

	public Plantae(String nombre) {
		super(nombre);
	}

	public String colorPlanta(String color) {
		return color;
	}

	@Override
	public String toString() {
		return nombre;
	}

	
}