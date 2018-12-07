package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.Test;

import Ecosistemas.CadenaAlimenticia;
import Ecosistemas.EslabonesAlimenticios;

class CadenaAlimenticiaTest {

	@Test
	void test() {
		EslabonesAlimenticios elEslabon = new EslabonesAlimenticios("El lobo se come al buho");
		Vector<EslabonesAlimenticios> losEslabones = new Vector<EslabonesAlimenticios>();
		losEslabones.add(elEslabon);
		
		CadenaAlimenticia laCadenaAlimenticia = new CadenaAlimenticia("Cadena alimenticia del bosque", losEslabones);
		assertEquals("Cadena alimenticia del bosque", laCadenaAlimenticia.getNombre());
		assertEquals(losEslabones, laCadenaAlimenticia.getLosEslabonesAlimenticios());
		assertEquals(5, laCadenaAlimenticia.cantEslabones(5));
	}

}
