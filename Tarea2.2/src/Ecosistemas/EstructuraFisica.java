package Ecosistemas;

public class EstructuraFisica {
	public String nombre;

	public EstructuraFisica(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public String usaEstructuraH(boolean usaEstH) {
		if(usaEstH) return "Estructura Horizontal";
		else return "Estructura Vertical";
	}

	
}