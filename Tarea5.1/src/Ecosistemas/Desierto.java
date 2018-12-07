package Ecosistemas;

import java.io.Serializable;
import java.util.Vector;

public class Desierto extends BiomaTerrestre implements Serializable{

	public Desierto(String nombre, Vector<Ecosistema> losEcosistemas) {
		super(nombre, losEcosistemas);
	}
	
	public Desierto(String nombre) {
		super(nombre);
	}

	public int area(int areaM) {
		return areaM;
	}

	@Override
	public String toString() {
		return nombre;
	}
}