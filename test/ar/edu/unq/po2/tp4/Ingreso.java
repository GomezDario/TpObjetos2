package ar.edu.unq.po2.tp4;

import java.time.LocalDate;

public class Ingreso {

	private LocalDate mesPercepcion;
	private String concepto;
	private Double montoPercibido;
	
	public Ingreso(LocalDate mesPercepcion, String concepto, Double montoPercibido) {
		
		this.mesPercepcion = mesPercepcion;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
		
	}
	
	

	public LocalDate getMesPercepcion() {
		return mesPercepcion;
	}

	public void setMesPercepcion(LocalDate mesPercepcion) {
		this.mesPercepcion = mesPercepcion;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public Double getMontoPercibido() {
		return montoPercibido;
	}

	public void setMontoPercibido(Double montoPercibido) {
		this.montoPercibido = montoPercibido;
	}
	
	public Double getMontoImponible() {
		
		return montoPercibido;
		
	}
	
	
	
	
	
	
	
	
}
