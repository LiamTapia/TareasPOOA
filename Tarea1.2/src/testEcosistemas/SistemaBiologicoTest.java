package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.Test;

import Ecosistemas.Biocenosis;
import Ecosistemas.Biotopo;
import Ecosistemas.Reinos;
import Ecosistemas.SistemaBiologico;

class SistemaBiologicoTest {

	@Test
	void test() {
		Reinos elReino = new Reinos("Animal");
		Vector<Reinos> losReinos = new Vector<Reinos>();
		losReinos.add(elReino);
		
		Biocenosis elBiocenosis = new Biocenosis("Ser vivo", losReinos);
		Vector<Biocenosis> losBiocenosis = new Vector<Biocenosis>();
		losBiocenosis.add(elBiocenosis);
		
		Biotopo elBiotopo = new Biotopo("Lugar");
		Vector<Biotopo> losBiotopos = new Vector<Biotopo>();
		losBiotopos.add(elBiotopo);
		
		SistemaBiologico elSistemaBiologico = new SistemaBiologico("El oceano", losBiocenosis, losBiotopos);
		assertEquals("El oceano", elSistemaBiologico.getNombre());
		assertEquals(losBiocenosis, elSistemaBiologico.getLosBiocenosis());
		assertEquals(losBiotopos, elSistemaBiologico.getLosBiotopos());
		assertEquals(true, elSistemaBiologico.armoniaSistema(true));
	}

}
