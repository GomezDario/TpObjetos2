package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {

	private Persona unaPersona;
	
	@BeforeEach
    public void setUp() {
		
    
		unaPersona = new Persona("Gabriel", LocalDate.of(2000, 11, 01));
		
		
    }
	
	
	
	@Test
	void testEdadDePersona() {
		
		Integer edad = unaPersona.edadDePersona();
		
		assertEquals(edad, 23);
		
	}

}
