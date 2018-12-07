package Ecosistemas;

public class Fungi extends Reinos{

	public Fungi(String nombre) {
		super(nombre);
	}

	public boolean esMortal(boolean mortal) {
		return mortal;
	}

	@Override
	public String toString() {
		return nombre;
	}

	
}