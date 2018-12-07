package Ecosistemas;

import java.util.Vector;

public class Rio extends BiomaLotico{

	public Rio(String nombre, Vector<Ecosistema> losEcosistemas) {
		super(nombre, losEcosistemas);
	}
	
	public Rio(String nombre) {
		super(nombre);
	}

	public int distancia(int longitud) {
		return longitud;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
}