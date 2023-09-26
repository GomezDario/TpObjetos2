package ar.edu.unq.po2.tp5;

public class Impuesto implements Facturable{

	private Double tasaDelServicio;
	private Agencia unaAgencia;
	private Factura unaFactura;
	
	
	public Impuesto(Double tasaDelServicio) {
		
		this.tasaDelServicio = tasaDelServicio;
	}

	public Double getTasaDelServicio() {
		return tasaDelServicio;
	}

	public void setTasaDelServicio(Double tasaDelServicio) {
		this.tasaDelServicio = tasaDelServicio;
	}

	@Override
	public Double getPrecio() {
		// TODO Auto-generated method stub
		return this.getTasaDelServicio();
	}

	public void registrar() {
		
		unaFactura = new Factura(this.getPrecio());
		unaAgencia = new AgenciaRecaudadora();
		
		unaAgencia.registrarPago(unaFactura);
		
	}
	
	
}
