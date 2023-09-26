package ar.edu.unq.po2.tp4;

import java.time.LocalDate;

public class IngresoHorasExtra extends Ingreso{

	private Integer cantidadHorasExtra;
	
	public IngresoHorasExtra(LocalDate mesPercepcion, String concepto, Double montoPercibido, Integer cantidadHorasExtra) {
		super(mesPercepcion, concepto, montoPercibido);
		this.cantidadHorasExtra = cantidadHorasExtra;
		
		
		// TODO Auto-generated constructor stub
	}

	
	public Integer getCantidadHorasExtra() {
		return cantidadHorasExtra;
	}

	public void setCantidadHorasExtra(Integer cantidadHorasExtra) {
		this.cantidadHorasExtra = cantidadHorasExtra;
	}

	public Double getMontoImponible() {
		
		return 0.0;
		
	}
	
	
	
	
}
