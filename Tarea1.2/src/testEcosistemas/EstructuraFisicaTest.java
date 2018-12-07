package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.EstructuraFisica;

class EstructuraFisicaTest {

	@Test
	void test() {
		EstructuraFisica laEstFisica = new EstructuraFisica("Estructura del mar");
		assertEquals("Estructura del mar", laEstFisica.getNombre());
		assertEquals("Estructura Horizontal", laEstFisica.usaEstructuraH(true));
	}

}
