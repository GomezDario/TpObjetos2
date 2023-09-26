package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTest {
	
	private Persona persona1;
	private Persona persona2;
	private Persona persona3;
	private Persona persona4;
	
	private EquipoDeTrabajo unEquipo;
	

	@BeforeEach
    public void setUp() {
		
    
		persona1 = new Persona("Gabriel", LocalDate.of(2000, 11, 01));
		persona2 = new Persona("Gabriel", LocalDate.of(2000, 11, 01));
		persona3 = new Persona("Gabriel", LocalDate.of(2000, 11, 01));
		persona4 = new Persona("Gabriel", LocalDate.of(2000, 11, 01));
		
		unEquipo = new EquipoDeTrabajo();
		
		unEquipo.agregarPersona(persona1);
		unEquipo.agregarPersona(persona2);
		unEquipo.agregarPersona(persona3);
		unEquipo.agregarPersona(persona4);
		
		
    }
	
	
	
	@Test
	void testPromedioEdadEquipo() {

		assertEquals(unEquipo.promedioEdadIntegrantes(), 23);
		
		
		
		
	}

}
