package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServicioTest {

	
	private Impuesto luz;
	private Servicio netflix;
	
	@BeforeEach
	public void setUp() {
		
		netflix = new Servicio(488d, 2);

	}

	
	@Test
	void testPrecioDeUnServicio() {
		
		assertEquals(netflix.getPrecio(), 976d);
				
	}

}
