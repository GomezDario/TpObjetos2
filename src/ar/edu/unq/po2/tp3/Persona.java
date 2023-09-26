package ar.edu.unq.po2.tp3;

import java.time.LocalDate;

public class Persona {

	private String nombre;
	private LocalDate fechaNacimiento;

	
	public Persona(String nombre, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	public Integer edadDePersona() {
		
		return LocalDate.now().getYear() - this.fechaNacimiento.getYear();
		
		
	}
	
	public Boolean menorQue(Persona persona) {
		
		return this.edadDePersona() < persona.edadDePersona();
		
		
	}
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
	
	
	
}
