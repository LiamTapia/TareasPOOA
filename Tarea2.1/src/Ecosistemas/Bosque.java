package Ecosistemas;

import java.util.Vector;

public class Bosque extends BiomaTerrestre{

	public Bosque(String nombre, Vector<Ecosistema> losEcosistemas) {
		super(nombre, losEcosistemas);
	}
	
	public Bosque(String nombre) {
		super(nombre);
	}

	public boolean haylluvia(boolean lluvia) {
		return lluvia;
	}

	@Override
	public String toString() {
		return nombre;
	}
}