package Ecosistemas;

import java.io.Serializable;

public class Procarionte extends Reinos implements Serializable{

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