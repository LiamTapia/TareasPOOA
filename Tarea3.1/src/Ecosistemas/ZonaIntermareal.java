package Ecosistemas;

import java.io.Serializable;
import java.util.Vector;

public class ZonaIntermareal extends BiomaMarino implements Serializable{

	public ZonaIntermareal(String nombre, Vector<Ecosistema> losEcosistemas) {
		super(nombre, losEcosistemas);
	}
	
	public ZonaIntermareal(String nombre) {
		super(nombre);
	}

	public int distanciaCosta(int dCosta) {
		return dCosta;
	}

	@Override
	public String toString() {
		return nombre;
	}
}