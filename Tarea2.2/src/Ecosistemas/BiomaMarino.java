package Ecosistemas;

import java.util.Vector;

public class BiomaMarino extends Bioma {

	public BiomaMarino(String nombre, Vector<Ecosistema> losEcosistemas) {
		super(nombre, losEcosistemas);
	}
	
	public BiomaMarino(String nombre) {
		super(nombre);
	}

	public boolean hayAnimales(boolean animales) {
		return animales;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
}