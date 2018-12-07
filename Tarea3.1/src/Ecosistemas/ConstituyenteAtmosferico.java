package Ecosistemas;

import java.io.Serializable;

public class ConstituyenteAtmosferico extends FactorAbiotico implements Serializable{

	public ConstituyenteAtmosferico(String nombre) {
		super(nombre);
	}

	public int cantConstAtmosfericos(int cantAtmos) {
		return cantAtmos;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
}