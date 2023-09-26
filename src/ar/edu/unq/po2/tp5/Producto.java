package ar.edu.unq.po2.tp5;

public class Producto implements Facturable {

	private Double precio;
	private String nombre;
	private Integer stock = 0;
	
	
	public Producto(Double precio, String nombre) {
		this.precio = precio;
		this.nombre = nombre;
		
	}

	
	public void registrar() {
		this.decrementarStock();
	}
	

	@Override
	public Double getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}
	
	public void decrementarStock() {
		
		if (getStock() > 0) {
			setStock(this.getStock()-1);
		}
		
	}
	
	public void aumentarStock(Integer unaCantidad) {
		
		this.setStock(this.getStock() + unaCantidad);
		
	}
	


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getStock() {
		return stock;
	}


	public void setStock(Integer stock) {
		this.stock = stock;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
	
	
	
}
