package Ecosistemas;

import java.util.Vector;

public class BiomaUSemiArtificial extends BiomaUrbano {

	public BiomaUSemiArtificial(String nombre, Vector<Ecosistema> losEcosistemas) {
		super(nombre, losEcosistemas);
	}

	public BiomaUSemiArtificial(String nombre) {
		super(nombre);
	}
	public boolean hayCarros(boolean carros) {
		return carros;
	}

	@Override
	public String toString() {
		return nombre;
	}
}