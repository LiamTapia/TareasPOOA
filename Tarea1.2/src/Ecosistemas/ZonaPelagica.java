package Ecosistemas;

import java.util.Vector;

public class ZonaPelagica extends BiomaMarino {

	public ZonaPelagica(String nombre, Vector<Ecosistema> losEcosistemas) {
		super(nombre, losEcosistemas);
	}
	
	public ZonaPelagica(String nombre) {
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