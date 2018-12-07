package Ecosistemas;

import java.io.Serializable;

public class Fungi extends Reinos implements Serializable{

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