package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {
	
	private Counter counter;
	
	
	  @BeforeEach
	    public void setUp() {
	        counter = new Counter();
	    }
	
	
	@Test
	void test() {
		
		
		
		counter.agregarNumero(2);
		counter.agregarNumero(1);
		counter.agregarNumero(4);
		counter.agregarNumero(5);
		counter.agregarNumero(6);
		
		
		Integer cantidadDePares = counter.cantidadDePares();
		
		assertEquals(cantidadDePares, 3);
		
	}

}
