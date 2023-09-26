package ar.edu.unq.po2.tp5.personas;

import java.time.LocalDate;

public class Persona implements Individuo{

	private String nombre;
	private LocalDate fechaNacimiento;
	
	
	public Persona(String nombre, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	
	public boolean esMayorQue(Persona unaPersona) {
		
		return this.edad() > unaPersona.edad();
		
	}
	
	
	public Integer edad() {
		
		return LocalDate.now().getYear() - this.fechaNacimiento.getYear();
		
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
