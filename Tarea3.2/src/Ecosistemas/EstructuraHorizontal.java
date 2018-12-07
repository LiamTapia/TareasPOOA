package Ecosistemas;

import java.io.Serializable;

public class EstructuraHorizontal extends EstructuraFisica implements Serializable{

	public EstructuraHorizontal(String nombre) {
		super(nombre);
	}

	public boolean usoEstructura(boolean usoEst) {
		return usoEst;
	}
	
}