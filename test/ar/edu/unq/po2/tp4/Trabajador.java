package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.Iterator;

public class Trabajador {

	private String nombre;
	
	private ArrayList<Ingreso> listaDeIngresos;

	public Trabajador(String nombre) {
		
		this.nombre = nombre;
		this.listaDeIngresos = new ArrayList<Ingreso>();
		
	}
	
	public Double getTotalPercibido() {
		
		Double totalPercibido = 0.0;
		
		for (Ingreso ingreso : listaDeIngresos) {
			
			totalPercibido += ingreso.getMontoPercibido();
			
		}
		
		return totalPercibido;
		
		
	}
	
	public Double getMontoImponible() {
		
		Double montoImponible = 0.0;
		
		for (Ingreso ingreso : listaDeIngresos) {
			
			montoImponible += ingreso.getMontoImponible();
		
			
		}
		
		return montoImponible;
		
		
	}
	
	public Double getImpuestoAPagar() {
		
		return this.getMontoImponible() * 0.02;
	}
	
	
}
