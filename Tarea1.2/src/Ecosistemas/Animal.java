package Ecosistemas;

public class Animal extends Reinos{
	int tienePatas;
	
	public Animal(String nombre, int tienePatas) {
		super(nombre);
		this.tienePatas = tienePatas;
	}
	
	public Animal(String nombre) {
		super(nombre);
	}

	public int patas(){
		return tienePatas;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
	
	
}