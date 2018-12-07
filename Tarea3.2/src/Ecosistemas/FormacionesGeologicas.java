package Ecosistemas;

import java.io.Serializable;

public class FormacionesGeologicas extends FactorAbiotico implements Serializable{

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