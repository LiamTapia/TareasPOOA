package Ecosistemas;

import java.io.Serializable;
import java.util.Vector;

public class Mar extends Ecosistema implements Serializable{

	public Mar(String nombre, Vector<Biocenosis> losBiocenosis, Vector<Biotopo> losBiotopos,
			Vector<FactorAbiotico> losFactoresAbioticos, Vector<CadenaAlimenticia> lasCadenasAlimenticias,
			Vector<EstructuraFisica> lasEstructurasFisicas) {
		super(nombre, losBiocenosis, losBiotopos, losFactoresAbioticos, lasCadenasAlimenticias,
				lasEstructurasFisicas);
	}
	
	public Mar(String nombre) {
		super(nombre);
	}

	public int profundidad(int distancia) {
		return distancia;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
	public void setNombre(String s) {
		nombre = s;
	}
}