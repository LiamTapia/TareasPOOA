package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.Plantae;

class PlantaeTest {

	@Test
	void test() {
		Plantae laPlantae = new Plantae("Cerezo");
		assertEquals("Cerezo", laPlantae.getNombre());
		assertEquals("Rosa", laPlantae.colorPlanta("Rosa"));
	}

}
