package ar.edu.unq.po2.tp5.personas;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.Caja;
import ar.edu.unq.po2.tp5.Impuesto;
import ar.edu.unq.po2.tp5.Producto;
import ar.edu.unq.po2.tp5.Servicio;

class PersonasYMascotasTest {

	private ArrayList<Individuo> individuos = new ArrayList<>();
	
	private Persona p1;
	private Persona p2;
	
	private Mascota m1;
	private Mascota m2;
	
	@BeforeEach
	public void setUp() {
		
		p1 = new Persona("p1", LocalDate.now());
		p2 = new Persona("p2", LocalDate.now());
		
		m1 = new Mascota("m1", "x");
		m2 = new Mascota("m2", "x");
		
		
		individuos.add(p1);
		individuos.add(p2);
		individuos.add(m1);
		individuos.add(m2);
		
		
	}
	
	
	@Test
	void testLosNombresDeTodos() {
		
		for (Individuo individuo : individuos) {
			
			System.out.print("el nombre: " + individuo.getNombre() + "\n" );
			
		}
		
		
		
	}

}
