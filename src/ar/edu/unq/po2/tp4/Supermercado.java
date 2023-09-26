package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

import ar.edu.unq.po2.tp3.Persona;

public class Supermercado {

	private String nombre;
	private String direccion;
	private ArrayList<Producto> listaDeProductos = new ArrayList<>();
	
	public Supermercado(String nombre, String direccion) {	
		
		this.nombre = nombre;
		this.direccion = direccion;
		
	}
	
	public void agregarProducto(Producto producto) {
		
		listaDeProductos.add(producto);
		
	}
	
	
	public Integer getCantidadDeProductos() {
		
		return listaDeProductos.size();
		
		
	}
	
	public Double getPrecioTotal() {
		
		Double total = 0.0;		
		for (Producto producto : listaDeProductos) {
			
			total += producto.getPrecio();
			
		}
		
		return total;
		
	}
	
	
	
}
