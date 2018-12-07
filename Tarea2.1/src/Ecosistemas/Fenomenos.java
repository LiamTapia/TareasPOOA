package Ecosistemas;

public class Fenomenos extends FactorAbiotico{

	public Fenomenos(String nombre) {
		super(nombre);
	}

	public int cantFenomenos(int cantFenomenos) {
		return cantFenomenos;
	}

	@Override
	public String toString() {
		return nombre;
	}
}