package Ecosistemas;

import java.util.Vector;

public class Isla extends Ecosistema{

	public Isla(String nombre, Vector<Biocenosis> losBiocenosis, Vector<Biotopo> losBiotopos,
			Vector<FactorAbiotico> losFactoresAbioticos, Vector<CadenaAlimenticia> lasCadenasAlimenticias,
			Vector<EstructuraFisica> lasEstructurasFisicas) {
		super(nombre, losBiocenosis, losBiotopos, losFactoresAbioticos, lasCadenasAlimenticias,
				lasEstructurasFisicas);
	}
	
	public Isla(String nombre) {
		super(nombre);
	}

	public int area(int longt, int longt2) {
		return longt * longt2;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
}