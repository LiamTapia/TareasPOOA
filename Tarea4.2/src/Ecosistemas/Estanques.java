package Ecosistemas;

import java.io.Serializable;
import java.util.Vector;

public class Estanques extends BiomaLentico implements Serializable {

	public Estanques(String nombre, Vector<Ecosistema> losEcosistemas) {
		super(nombre, losEcosistemas);
	}
	
	public Estanques(String nombre) {
		super(nombre);
	}

	public boolean hayVida(boolean vida) {
		return vida;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
	
}