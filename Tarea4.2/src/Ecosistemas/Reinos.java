package Ecosistemas;

import java.io.Serializable;

public class Reinos implements Serializable{
	public String nombre;

	public Reinos(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean hayReinos(boolean reino) {
		return reino;
	}
	
	

	
}