package Ecosistemas;

import java.io.Serializable;
import java.util.Vector;

public class Biocenosis implements Serializable{
	public String nombre;
	public Vector<Reinos> losReinos = new Vector<Reinos>();
	
	public Biocenosis(String nombre, Vector<Reinos> losReinos) {
		super();
		this.nombre = nombre;
		this.losReinos = losReinos;
	}
	
	public Biocenosis(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public Vector<Reinos> getLosReinos() {
		return losReinos;
	}
	
}