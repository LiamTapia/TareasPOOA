package Ecosistemas;

import java.io.Serializable;
import java.util.Vector;

public class Tundra extends BiomaTerrestre implements Serializable{

	public Tundra(String nombre, Vector<Ecosistema> losEcosistemas) {
		super(nombre, losEcosistemas);
	}
	
	public Tundra(String nombre) {
		super(nombre);
	}

	public String colorPrincipal(String color) {
		return color;
	}

	@Override
	public String toString() {
		return nombre;
	}
}