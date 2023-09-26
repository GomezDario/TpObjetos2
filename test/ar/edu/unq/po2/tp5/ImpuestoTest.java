package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ImpuestoTest {

	private Impuesto luz;
	
	@BeforeEach
	public void setUp() {
		
		luz = new Impuesto(84d);
			
	}
	
	
	@Test
	void testDePrecioDeUnImpuesto() {
		
		assertEquals(luz.getPrecio(), 84d);
		
		
	}

}
