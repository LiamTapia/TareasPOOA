package Ecosistemas;

import java.util.Vector;

public class Humedales extends BiomaLentico{

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