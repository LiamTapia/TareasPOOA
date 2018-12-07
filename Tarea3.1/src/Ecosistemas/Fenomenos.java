package Ecosistemas;

import java.io.Serializable;

public class Fenomenos extends FactorAbiotico implements Serializable{

	public Fenomenos(String nombre) {
		super(nombre);
	}

	public int cantFenomenos(int cantFenomenos) {
		return cantFenomenos;
	}

	@Override
	public String toString() {
		return nombre;
	}
}