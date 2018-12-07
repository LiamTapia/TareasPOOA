package Ecosistemas;

import java.util.Vector;

public class ZonaDemesal extends BiomaMarino{

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