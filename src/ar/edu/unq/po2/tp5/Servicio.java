package ar.edu.unq.po2.tp5;

public class Servicio implements Facturable{

	private Double costoPorUnidad;
	private Integer cantidadDeUnidadesConsumidas;
	private Agencia unaAgencia;
	private Factura unaFactura;
	
	
	
	public Servicio(Double costoPorUnidad, Integer cantidadDeUnidadesConsumidas) {
		
		this.costoPorUnidad = costoPorUnidad;
		
		this.cantidadDeUnidadesConsumidas = cantidadDeUnidadesConsumidas;
		
	}
	
	
	public Double getCostoPorUnidad() {
		return costoPorUnidad;
	}
	public void setCostoPorUnidad(Double costoPorUnidad) {
		this.costoPorUnidad = costoPorUnidad;
	}
	public Integer getCantidadDeUnidadesConsumidas() {
		return cantidadDeUnidadesConsumidas;
	}
	public void setCantidadDeUnidadesConsumidas(Integer cantidadDeUnidadesConsumidas) {
		this.cantidadDeUnidadesConsumidas = cantidadDeUnidadesConsumidas;
	}



	@Override
	public Double getPrecio() {
		// TODO Auto-generated method stub
		return this.getCostoPorUnidad() * this.getCantidadDeUnidadesConsumidas();
	}
	
	public void registrar() {
		
		unaFactura = new Factura(this.getPrecio());
		unaAgencia = new AgenciaRecaudadora();
		
		unaAgencia.registrarPago(unaFactura);
		
	}
	
	
	
	
	
	
	
}
