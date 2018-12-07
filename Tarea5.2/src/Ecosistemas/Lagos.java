package Ecosistemas;

import java.io.Serializable;
import java.util.Vector;

public class Lagos extends BiomaLentico implements Serializable{

	public Lagos(String nombre, Vector<Ecosistema> losEcosistemas) {
		super(nombre, losEcosistemas);
	}
	
	public Lagos(String nombre) {
		super(nombre);
	}

	public boolean hayAlgas(boolean vida) {
		return vida;
	}

	@Override
	public String toString() {
		return nombre;
	}
}