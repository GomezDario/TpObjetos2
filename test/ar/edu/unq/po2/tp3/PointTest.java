package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTest {

	private Point point;
	private Point otroPoint;
	private Point otroPoint2;
	
	@BeforeEach
    public void setUp() {
		
        point = new Point();
        otroPoint = new Point(5,8);
        otroPoint2 = new Point(4,3);
        
    }
	
	
	@Test
	void testPoint00() {
		
		assertEquals(point.getX(), 0);
		assertEquals(point.getY(), 0);

	}
	
	@Test
	void testPoint58() {
		
		assertEquals(otroPoint.getX(), 5);
		assertEquals(otroPoint.getY(), 8);

	}
	
	@Test
	void testMoverEjeX() {
		
		point.moverPuntoX(7);
		
		
		assertEquals(point.getX(), 7);
		assertEquals(point.getY(), 0);

	}
	
	
	@Test
	void testMoverEjeY() {
		
		point.moverPuntoY(4);
		
		
		assertEquals(point.getX(), 0);
		assertEquals(point.getY(), 4);

	}
	
	@Test
	void testSumarPuntos() {
		
		Point unPunto = otroPoint.sumarPunto(otroPoint2);
		
		assertEquals(unPunto.getX(), 9);
		assertEquals(unPunto.getY(), 11);
		

	}
	
	
	
	
	
	
	
	
	

}
