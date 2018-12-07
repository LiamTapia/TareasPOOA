package Ecosistemas;

import java.io.Serializable;

public class CambiosQuimicos extends Fenomenos implements Serializable{

	public CambiosQuimicos(String nombre) {
		super(nombre);
	}

	public boolean hayCambioQuimico(boolean cambioQuimico) {
		return cambioQuimico;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
}