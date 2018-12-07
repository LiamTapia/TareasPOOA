package Ecosistemas;

public class ConstituyenteAtmosferico extends FactorAbiotico {

	public ConstituyenteAtmosferico(String nombre) {
		super(nombre);
	}

	public int cantConstAtmosfericos(int cantAtmos) {
		return cantAtmos;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
}