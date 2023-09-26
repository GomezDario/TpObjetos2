package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTest {

	private Multioperador multioperador;
	
	
	 @BeforeEach
	    public void setUp() {
	        multioperador = new Multioperador();
	    }
	
	@Test
	void testSuma() {
	
		multioperador.agregarNumero(5);
		multioperador.agregarNumero(5);
		multioperador.agregarNumero(5);
		multioperador.agregarNumero(5);
		
		
		Integer total = multioperador.sumaDeTodosLosNumeros();
		
		assertEquals(total, 20);
		
		
		
		
	}
	
	@Test
	void testResta() {
	
		multioperador.agregarNumero(50);
		multioperador.agregarNumero(10);
		multioperador.agregarNumero(10);
		multioperador.agregarNumero(10);
		
		
		Integer total = multioperador.restaDeTodosLosNumeros();
		
		assertEquals(total, -80);
		
	}
	
	@Test
	void testMultiplicacion() {
		
		multioperador.agregarNumero(50);
		multioperador.agregarNumero(10);
		multioperador.agregarNumero(10);
		multioperador.agregarNumero(10);
		
		Integer total = multioperador.multiplicacionDeTodosLosNumeros();
		
		assertEquals(total, 50000);
		
		
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
