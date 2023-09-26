package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {

	private Caja unaCaja;
	
	private Producto arroz;
	private Producto vino;
	
	@BeforeEach
	public void setUp() {
		
		unaCaja = new Caja();
		
		
		arroz = new Producto(18.9d, "Arroz");
		vino = new Producto(55.4d, "Vino");
		
		arroz.aumentarStock(20);
		vino.aumentarStock(15);
		
		
		
	}
	
	@Test 
	void aumentarStockDeUnProducto() {
		
		assertEquals(arroz.getStock(), 20);
		arroz.aumentarStock(1);
		assertEquals(arroz.getStock(), 21);
		
	}
	
	
	@Test
	void testDecrementarStockDeUnProducto() {
	
		assertEquals(arroz.getStock(), 20);
		arroz.decrementarStock();
		assertEquals(arroz.getStock(), 19);
		
		
	}

	@Test
	void testPrecioDeUnProducto() {
	
		assertEquals(arroz.getPrecio(), 18.9d);
		
		
	}
	
	
	
	
	
}
