package Ecosistemas;

import java.io.Serializable;
import java.util.Vector;

public class BiomaLotico extends BiomaAguaDulce implements Serializable{
	
	public BiomaLotico(String nombre, Vector<Ecosistema> losEcosistemas) {
		super(nombre, losEcosistemas);
	}
	
	public BiomaLotico(String nombre) {
		super(nombre);
	}

	public boolean hayCoral(boolean coral) {
		return coral;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
	
}