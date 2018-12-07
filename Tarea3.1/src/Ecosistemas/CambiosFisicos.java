package Ecosistemas;

import java.io.Serializable;

public class CambiosFisicos extends Fenomenos implements Serializable{

	public CambiosFisicos(String nombre) {
		super(nombre);
	}

	public boolean hayCambio(boolean cambio) {
		return cambio;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
}