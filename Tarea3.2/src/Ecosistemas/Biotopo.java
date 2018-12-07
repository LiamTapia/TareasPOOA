package Ecosistemas;

import java.io.Serializable;

public class Biotopo implements Serializable{
	public String nombre;

	public Biotopo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean sueloFertil(boolean fertil) {
		return fertil;
	}

}