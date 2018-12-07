package Ecosistemas;

import java.io.Serializable;

public class Protista extends Reinos implements Serializable{

	public Protista(String nombre) {
		super(nombre);
	}

	public String colorP(String color) {
		return color;
	}

	@Override
	public String toString() {
		return nombre;
	}

	
}