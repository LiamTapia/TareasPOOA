package Ecosistemas;

import java.io.Serializable;

public class EstructuraVertical extends EstructuraFisica implements Serializable{

	public EstructuraVertical(String nombre) {
		super(nombre);
	}

	public boolean usoEstructura(boolean usoEst) {
		return usoEst;
	}

}