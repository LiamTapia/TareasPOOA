package Ecosistemas;

import java.io.Serializable;
import java.util.Vector;

public class Pradera extends BiomaTerrestre implements Serializable {

	public Pradera(String nombre, Vector<Ecosistema> losEcosistemas) {
		super(nombre, losEcosistemas);
	}
	
	public Pradera(String nombre) {
		super(nombre);
	}

	public int cantAnimales(int cantAnimal) {
		return cantAnimal;
	}

	@Override
	public String toString() {
		return nombre;
	}
}