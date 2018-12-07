package Ecosistemas;

import java.io.Serializable;
import java.util.Vector;

public class ZonaAbisal extends BiomaMarino implements Serializable{

	public ZonaAbisal(String nombre, Vector<Ecosistema> losEcosistemas) {
		super(nombre, losEcosistemas);
	}
	
	public ZonaAbisal(String nombre) {
		super(nombre);
	}
	
	public boolean hayLuz(boolean luz) {
		return luz;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
}