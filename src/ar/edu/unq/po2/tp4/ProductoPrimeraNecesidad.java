package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {

	private Double descuento;
	
	
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean esPrecioCuidado) {
		super(nombre, precio, esPrecioCuidado);
		// TODO Auto-generated constructor stub
	}	
	
	
	public ProductoPrimeraNecesidad(String nombre, Double precio,Boolean esPrecioCuidado, Double descuento) {
		super(nombre, precio, esPrecioCuidado);
		this.descuento = descuento;
	}


	public Double getPrecio() {
		return super.getPrecio() * descuento;
	}

	
}
