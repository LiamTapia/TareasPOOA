package Ecosistemas;

import java.io.Serializable;
import java.util.Vector;

public class Sabana extends BiomaTerrestre implements Serializable{

	public Sabana(String nombre, Vector<Ecosistema> losEcosistemas) {
		super(nombre, losEcosistemas);
	}
	
	public Sabana(String nombre) {
		super(nombre);
	}

	public boolean hayAldea(boolean aldea) {
		return aldea;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
}