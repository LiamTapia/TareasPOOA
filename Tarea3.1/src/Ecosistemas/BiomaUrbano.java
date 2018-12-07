package Ecosistemas;

import java.io.Serializable;
import java.util.Vector;

public class BiomaUrbano extends Bioma implements Serializable{

	public BiomaUrbano(String nombre, Vector<Ecosistema> losEcosistemas) {
		super(nombre, losEcosistemas);
	}
	
	public BiomaUrbano(String nombre) {
		super(nombre);
	}

	public boolean hayEdificios(boolean edificios) {
		return edificios;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
}