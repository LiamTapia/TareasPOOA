package Ecosistemas;

import java.io.Serializable;

public class Plantae extends Reinos implements Serializable{

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