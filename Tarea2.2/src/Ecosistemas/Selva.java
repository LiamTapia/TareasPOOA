package Ecosistemas;

import java.util.Vector;

public class Selva extends BiomaTerrestre{

	public Selva(String nombre, Vector<Ecosistema> losEcosistemas) {
		super(nombre, losEcosistemas);
	}
	
	public Selva(String nombre) {
		super(nombre);
	}

	public boolean hayMono(boolean mono) {
		return mono;
	}

	@Override
	public String toString() {
		return nombre;
	}
}