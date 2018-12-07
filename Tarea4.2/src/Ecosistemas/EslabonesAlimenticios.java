package Ecosistemas;

import java.io.Serializable;

public class EslabonesAlimenticios implements Serializable{
	public String nombre;

	public EslabonesAlimenticios(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public int cantEslabones(int cant) {
		return cant;
	}

	
}