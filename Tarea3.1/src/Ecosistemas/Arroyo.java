package Ecosistemas;

import java.io.Serializable;
import java.util.Vector;

public class Arroyo extends BiomaLotico implements Serializable{

	public Arroyo(String nombre, Vector<Ecosistema> losEcosistemas) {
		super(nombre, losEcosistemas);
	}
	
	public Arroyo(String nombre) {
		super(nombre);
	}
	
	public boolean hayAgua(boolean agua) {
		return agua;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
	
}