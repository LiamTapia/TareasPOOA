package Ecosistemas;

import java.io.Serializable;
import java.util.Vector;

public class BiomaLentico extends BiomaAguaDulce implements Serializable{

	public BiomaLentico(String nombre, Vector<Ecosistema> losEcosistemas) {
		super(nombre, losEcosistemas);
	}
	
	public BiomaLentico(String nombre) {
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