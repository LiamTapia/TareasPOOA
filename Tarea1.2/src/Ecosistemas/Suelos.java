package Ecosistemas;

public class Suelos extends FactorAbiotico{

	public Suelos(String nombre) {
		super(nombre);
	}

	public boolean hayCesped(boolean cesped) {
		return cesped;
	}

	
	@Override
	public String toString() {
		return nombre;
	}
}