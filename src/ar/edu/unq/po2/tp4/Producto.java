package ar.edu.unq.po2.tp4;

public class Producto {

	private String nombre;
	private Double precio;
	private Boolean esPrecioCuidado = false;
	
	
	
	
	public Producto(String nombre, Double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}


	public Producto(String nombre, Double precio, Boolean esPrecioCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}

	
	public void aumentarPrecio(Double aumento) {
		
		Double precioActual = this.getPrecio();
		
		this.setPrecio(precioActual + aumento);
		
	}
	
	
	
	
	/// GET´S & SET´S
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	public Boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}


	public void setEsPrecioCuidado(Boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	
	
	
	
	
	
	
}
