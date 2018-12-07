package Ecosistemas;

import java.io.Serializable;
import java.util.Vector;


public class Ecosistema extends SistemaBiologico implements Serializable{
	public Vector<FactorAbiotico> losFactoresAbioticos = new Vector<FactorAbiotico>();
	public Vector<CadenaAlimenticia> lasCadenasAlimenticias = new Vector<CadenaAlimenticia>();
	public Vector<EstructuraFisica> lasEstructurasFisicas = new Vector<EstructuraFisica>();
	

	public Ecosistema(String nombre, Vector<Biocenosis> losBiocenosis, Vector<Biotopo> losBiotopos,
			Vector<FactorAbiotico> losFactoresAbioticos, Vector<CadenaAlimenticia> lasCadenasAlimenticias,
			Vector<EstructuraFisica> lasEstructurasFisicas) {
		super(nombre, losBiocenosis, losBiotopos);
		this.losFactoresAbioticos = losFactoresAbioticos;
		this.lasCadenasAlimenticias = lasCadenasAlimenticias;
		this.lasEstructurasFisicas = lasEstructurasFisicas;
	}

	public Ecosistema() {
		super("default");
	}
	
	public Ecosistema(String nombre) {
		super(nombre);
	}
	
	public Vector<FactorAbiotico> getLosFactoresAbioticos() {
		return losFactoresAbioticos;
	}

	public Vector<CadenaAlimenticia> getLasCadenasAlimenticias() {
		return lasCadenasAlimenticias;
	}

	public Vector<EstructuraFisica> getLasEstructurasFisicas() {
		return lasEstructurasFisicas;
	}

	public boolean interdependenciaEcosistema(boolean interdependencia) {
		return interdependencia;
	}
	
	public void setNombre(String s) {
		nombre = s;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre;
	}
	
	

	
}