package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTest {

	private Rectangulo unRectangulo;
	private Point unPunto;
	
	@BeforeEach
    public void setUp() {
		
    
		unPunto = new Point(5,8);
		unRectangulo = new Rectangulo(unPunto);
		
		
    }
	
	
	
	
	@Test
	void testAreaRectangulo() {
	
		Integer areaTotal = unRectangulo.elAreaDelRectangulo();
		
		assertEquals(40, areaTotal);
		
		
	}
	
	@Test
	void testPerimetroDelRectangulo() {
	
		Integer perimetroTotal = unRectangulo.perimetroTotalDelRectangulo();
		
		assertEquals(26, perimetroTotal);
		
		
	}
	
	
	@Test
	void testEsUnRectanguloHorizontal() {
	
		
		assertFalse(unRectangulo.esUnRectanguloHorizontal());
		
		
		
	}

	
	@Test
	void testEsUnRectanguloVertical() {
	
		
		assertTrue(unRectangulo.esUnRectanguloVertical());
		
		
		
	}
	
	
}
