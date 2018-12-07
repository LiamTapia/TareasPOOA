package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.Test;

import Ecosistemas.Biocenosis;
import Ecosistemas.Biotopo;
import Ecosistemas.CadenaAlimenticia;
import Ecosistemas.Ecosistema;
import Ecosistemas.EslabonesAlimenticios;
import Ecosistemas.EstructuraFisica;
import Ecosistemas.FactorAbiotico;
import Ecosistemas.Reinos;

class EcosistemaTest {

	@Test
	void test() {
		assertEquals("default",new Ecosistema().getNombre());
		
		Reinos elReino = new Reinos("Animal");
		Vector<Reinos> losReinos = new Vector<Reinos>();
		losReinos.add(elReino);
		
		Biocenosis elBiocenosis = new Biocenosis("Ser vivo", losReinos);
		Vector<Biocenosis> losBiocenosis = new Vector<Biocenosis>();
		losBiocenosis.add(elBiocenosis);
		
		Biotopo elBiotopo = new Biotopo("Lugar");
		Vector<Biotopo> losBiotopos = new Vector<Biotopo>();
		losBiotopos.add(elBiotopo);
		
		FactorAbiotico elFactorAbiotico = new FactorAbiotico("Tierra");
		Vector<FactorAbiotico> losFactoresAbioticos = new Vector<FactorAbiotico>();
		losFactoresAbioticos.add(elFactorAbiotico);
		
		EslabonesAlimenticios elEslabon = new EslabonesAlimenticios("El lobo se come al buho");
		Vector<EslabonesAlimenticios> losEslabones = new Vector<EslabonesAlimenticios>();
		losEslabones.add(elEslabon);
		
		CadenaAlimenticia laCadenaAlimenticia = new CadenaAlimenticia("Cadena alimenticia del bosque", losEslabones);
		Vector<CadenaAlimenticia> lasCadenasAlimenticias = new Vector<CadenaAlimenticia>();
		lasCadenasAlimenticias.add(laCadenaAlimenticia);
		
		EstructuraFisica laEstFisica = new EstructuraFisica("Estructura horizontal");
		Vector<EstructuraFisica> lasEstFisicas = new Vector<EstructuraFisica>();
		lasEstFisicas.add(laEstFisica);
		
		
		Ecosistema elEcosistema = new Ecosistema("Sistema del bosque", losBiocenosis, losBiotopos, 
												losFactoresAbioticos, lasCadenasAlimenticias, lasEstFisicas);
	
		assertEquals("Sistema del bosque", elEcosistema.getNombre());
		assertEquals(losBiocenosis, elEcosistema.getLosBiocenosis());
		assertEquals(losBiotopos, elEcosistema.getLosBiotopos());
		assertEquals(losFactoresAbioticos, elEcosistema.getLosFactoresAbioticos());
		assertEquals(lasCadenasAlimenticias, elEcosistema.getLasCadenasAlimenticias());
		assertEquals(lasEstFisicas, elEcosistema.getLasEstructurasFisicas());
		assertEquals(true, elEcosistema.armoniaSistema(true));
	
	}

}
