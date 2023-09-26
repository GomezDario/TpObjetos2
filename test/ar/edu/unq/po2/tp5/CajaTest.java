package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CajaTest {
	private Caja unaCaja;
	
	private Producto arroz;
	private Producto vino;
	
	private Impuesto luz;
	private Servicio netflix;
	
	@BeforeEach
	public void setUp() {
		
		unaCaja = new Caja();
		
		
		arroz = new Producto(18.9d, "Arroz");
		vino = new Producto(55.4d, "Vino");
		
		luz = new Impuesto(84d);
		netflix = new Servicio(488d, 1);
	
		arroz.aumentarStock(20);
		vino.aumentarStock(15);
		
		
		
	}

	@Test
	void testRegistrarPagoProductos() {
		
		assertEquals(arroz.getStock(), 20);
		
		unaCaja.registrarPago(arroz);
		unaCaja.registrarPago(vino);
		
		
		assertEquals(unaCaja.getMontoTotal(), 74.3d);
		assertEquals(arroz.getStock(), 19);
	}
	
	@Test 
	
	void testRegistrarPagoDeServicio() {
		
		unaCaja.registrarPago(netflix);
		assertEquals(unaCaja.getMontoTotal(), 488.0);
		
		
	}
	
	

}
