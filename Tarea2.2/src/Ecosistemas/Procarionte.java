package Ecosistemas;

public class Procarionte extends Reinos{

	public Procarionte(String nombre) {
		super(nombre);
	}

	public int tamano(int distNano) {
		return distNano;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
	
}