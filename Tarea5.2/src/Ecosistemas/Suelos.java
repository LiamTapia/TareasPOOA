package Ecosistemas;

import java.io.Serializable;

public class Suelos extends FactorAbiotico implements Serializable{

	public Suelos(String nombre) {
		super(nombre);
	}

	public boolean hayCesped(boolean cesped) {
		return cesped;
	}

	
	@Override
	public String toString() {
		return nombre;
	}
}