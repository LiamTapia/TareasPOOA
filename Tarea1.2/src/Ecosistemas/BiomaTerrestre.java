package Ecosistemas;

import java.util.Vector;

public class BiomaTerrestre extends Bioma {

	public BiomaTerrestre(String nombre, Vector<Ecosistema> losEcosistemas) {
		super(nombre, losEcosistemas);
	}
	
	public BiomaTerrestre(String nombre) {
		super(nombre);
	}

	public boolean hayPajaros(boolean pajaros) {
		return pajaros;
	}

	
}