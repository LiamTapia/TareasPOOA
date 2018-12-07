package Ecosistemas;

import java.io.Serializable;

public class EstructuraFisica implements Serializable{
	public String nombre;

	public EstructuraFisica(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public String usaEstructuraH(boolean usaEstH) {
		if(usaEstH) return "Estructura Horizontal";
		else return "Estructura Vertical";
	}

	
}