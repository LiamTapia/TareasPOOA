package Ecosistemas;

import java.util.Vector;

public class CadenaAlimenticia{
	public String nombre;
	public Vector<EslabonesAlimenticios> losEslabonesAlimenticios = new Vector<EslabonesAlimenticios>();
	
	public CadenaAlimenticia(String nombre, Vector<EslabonesAlimenticios> losEslabonesAlimenticios) {
		super();
		this.nombre = nombre;
		this.losEslabonesAlimenticios = losEslabonesAlimenticios;
	}

	public String getNombre() {
		return nombre;
	}

	public Vector<EslabonesAlimenticios> getLosEslabonesAlimenticios() {
		return losEslabonesAlimenticios;
	}

	public int cantEslabones(int numEslabones) {
		return numEslabones;
	}

	
}