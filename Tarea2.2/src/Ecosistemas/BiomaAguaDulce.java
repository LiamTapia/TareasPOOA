package Ecosistemas;

import java.util.Vector;

public class BiomaAguaDulce extends Bioma{

	public BiomaAguaDulce(String nombre, Vector<Ecosistema> losEcosistemas) {
		super(nombre, losEcosistemas);
	}
	
	public BiomaAguaDulce(String nombre) {
		super(nombre);
	}

	public boolean hayPeces(boolean peces) {
		return peces;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
}