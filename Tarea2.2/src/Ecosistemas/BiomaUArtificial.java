package Ecosistemas;

import java.util.Vector;

public class BiomaUArtificial extends BiomaUrbano{

	public BiomaUArtificial(String nombre, Vector<Ecosistema> losEcosistemas) {
		super(nombre, losEcosistemas);
	}
	
	public BiomaUArtificial(String nombre) {
		super(nombre);
	}

	public boolean hayCarreteras(boolean carre) {
		return carre;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
	
}