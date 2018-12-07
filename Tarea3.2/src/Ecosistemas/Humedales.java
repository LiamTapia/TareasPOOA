package Ecosistemas;

import java.io.Serializable;
import java.util.Vector;

public class Humedales extends BiomaLentico implements Serializable{

	public Humedales(String nombre, Vector<Ecosistema> losEcosistemas) {
		super(nombre, losEcosistemas);
	}

	public Humedales(String nombre) {
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