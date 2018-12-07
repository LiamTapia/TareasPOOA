package Ecosistemas;

public class FormacionesGeologicas extends FactorAbiotico {

	public FormacionesGeologicas(String nombre) {
		super(nombre);
	}

	public int cantidadFormaciones(int cantFormaciones) {
		return cantFormaciones;
	}

	@Override
	public String toString() {
		return nombre;
	}
}