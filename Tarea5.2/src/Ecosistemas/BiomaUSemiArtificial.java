package Ecosistemas;

import java.io.Serializable;
import java.util.Vector;

public class BiomaUSemiArtificial extends BiomaUrbano implements Serializable{

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