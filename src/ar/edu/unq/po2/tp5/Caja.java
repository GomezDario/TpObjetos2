package ar.edu.unq.po2.tp5;

public class Caja{
	
	private Double montoTotal;
	
	public Caja() {
		
		this.montoTotal = 0d;
		
	}

	
	public Double montoTotalAPagar() {
	
		return this.getMontoTotal();
		
	}
	
	public void aumentarMontoTotal(Double unNum) {
		
		this.setMontoTotal(this.getMontoTotal() + unNum);
		
	}
	
	
	
	public void registrarPago(Facturable facturable) {
		
		facturable.registrar();
		this.aumentarMontoTotal(facturable.getPrecio());
	}
	
	
	/// GETS Y SETS

	public Double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(Double montoTotal) {
		this.montoTotal = montoTotal;
	}


	
}
