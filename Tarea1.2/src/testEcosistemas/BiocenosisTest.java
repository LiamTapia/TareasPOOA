package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.Test;

import Ecosistemas.Biocenosis;
import Ecosistemas.Reinos;

class BiocenosisTest {

	@Test
	void test() {
		Reinos elReino = new Reinos("Animal");
		Vector<Reinos> losReinos = new Vector<Reinos>();
		losReinos.add(elReino);
		
		Biocenosis laBiocenosis = new Biocenosis("Biocenosis de la selva", losReinos);
		assertEquals("Biocenosis de la selva", laBiocenosis.getNombre());
		assertEquals(losReinos, laBiocenosis.getLosReinos());
	}

}
