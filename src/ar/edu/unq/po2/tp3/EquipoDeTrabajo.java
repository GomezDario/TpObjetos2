package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {

	private ArrayList<Persona> listaDePersonas = new ArrayList<Persona>();
	private String nombreDeEquipo;
	
	
	
	public void agregarPersona(Persona persona) {
		
		listaDePersonas.add(persona);
		
		
	}
	
	public Integer promedioEdadIntegrantes() {
		
		Integer promedio = 0;
		
		for (Persona persona : listaDePersonas) {
			
			promedio += persona.edadDePersona();
			
		}
		
		return promedio / listaDePersonas.size();
		
	}
	
	
	
	
	
	
	public String getNombreDeEquipo() {
		return nombreDeEquipo;
	}
	public void setNombreDeEquipo(String nombreDeEquipo) {
		this.nombreDeEquipo = nombreDeEquipo;
	}
	
	
	
	
	
}
