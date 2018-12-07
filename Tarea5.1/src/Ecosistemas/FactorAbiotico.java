package Ecosistemas;

import java.io.Serializable;

public class FactorAbiotico implements Serializable{
	public String nombre;

	public FactorAbiotico(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public int cantFactorAbiotico(int cantFactores) {
		return cantFactores;
	}

	
}