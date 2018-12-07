package Ecosistemas;

import java.io.Serializable;
import java.util.Vector;

public class ZonaDemesal extends BiomaMarino implements Serializable{

	public ZonaDemesal(String nombre, Vector<Ecosistema> losEcosistemas) {
		super(nombre, losEcosistemas);
	}

	public ZonaDemesal(String nombre) {
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