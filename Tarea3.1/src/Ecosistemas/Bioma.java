package Ecosistemas;

import java.io.Serializable;
import java.util.Vector;

public class Bioma implements Serializable {
	public String nombre;
	public Vector<Ecosistema> losEcosistemas = new Vector<Ecosistema>();
	
	public Bioma(String nombre, Vector<Ecosistema> losEcosistemas) {
		super();
		this.nombre = nombre;
		this.losEcosistemas = losEcosistemas;
	}
	
	public Bioma(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public Vector<Ecosistema> getLosEcosistemas() {
		return losEcosistemas;
	}
	
}