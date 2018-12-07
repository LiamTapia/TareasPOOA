package Ecosistemas;

import java.io.Serializable;
import java.util.Vector;


public class SistemaBiologico implements Serializable{
	public String nombre;
	public Vector<Biocenosis> losBiocenosis = new Vector<Biocenosis>();
	public Vector<Biotopo> losBiotopos = new Vector<Biotopo>();
	
	public SistemaBiologico(String nombre, Vector<Biocenosis> losBiocenosis, Vector<Biotopo> losBiotopos) {
		super();
		this.nombre = nombre;
		this.losBiocenosis = losBiocenosis;
		this.losBiotopos = losBiotopos;
	}
	
	public SistemaBiologico(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public Vector<Biocenosis> getLosBiocenosis() {
		return losBiocenosis;
	}

	public Vector<Biotopo> getLosBiotopos() {
		return losBiotopos;
	}

	public boolean armoniaSistema(boolean armonia) {
		return armonia;
	}

	
}