package Ecosistemas;

public class CambiosQuimicos extends Fenomenos{

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