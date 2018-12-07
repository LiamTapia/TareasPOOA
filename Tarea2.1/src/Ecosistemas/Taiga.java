package Ecosistemas;

import java.util.Vector;

public class Taiga extends BiomaTerrestre{

	public Taiga(String nombre, Vector<Ecosistema> losEcosistemas) {
		super(nombre, losEcosistemas);
	}
	
	public Taiga(String nombre) {
		super(nombre);
	}

	public int alto(int distancia) {
		return distancia;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
}