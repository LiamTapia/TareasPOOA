package Ecosistemas;

public class CambiosFisicos extends Fenomenos {

	public CambiosFisicos(String nombre) {
		super(nombre);
	}

	public boolean hayCambio(boolean cambio) {
		return cambio;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
}