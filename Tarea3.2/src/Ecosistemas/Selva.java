package Ecosistemas;

import java.io.Serializable;
import java.util.Vector;

public class Selva extends BiomaTerrestre implements Serializable{

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