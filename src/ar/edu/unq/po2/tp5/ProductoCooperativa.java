package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto {

	private Double precio;
	private String nombre;

	public ProductoCooperativa(Double precio, String nombre) {
		super(precio, nombre);
		
	}

	@Override
	public Double getPrecio() {
		
		return this.getPrecio() * 0.1;
	}

	
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
