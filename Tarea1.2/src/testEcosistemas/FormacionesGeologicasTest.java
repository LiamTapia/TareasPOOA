package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.FormacionesGeologicas;

class FormacionesGeologicasTest {

	@Test
	void test() {
		FormacionesGeologicas laFormacionGeo = new FormacionesGeologicas("Rocas apiladas");
		assertEquals("Rocas apiladas", laFormacionGeo.getNombre());
		assertEquals(5, laFormacionGeo.cantidadFormaciones(5));
	}

}
