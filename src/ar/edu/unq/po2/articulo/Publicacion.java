package ar.edu.unq.po2.tp12.articulo;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Publicacion {

	private List<Observador> subscribers;
	private List<Articulo> articulos;
	
	
	public Publicacion() {
		super();
		this.subscribers = new ArrayList<Observador>();
		this.articulos = new ArrayList<Articulo>();
	}
	
	public List<Observador> getSubscribers() {
		return subscribers;
	}


	public void setSubscribers(List<Observador> subscribers) {
		this.subscribers = subscribers;
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

	private boolean estaSuscripto(Observador obs) {
		return this.getSubscribers().contains(obs);
	}

	
	public void subscribir(Observador obs) {
		
		if (!this.estaSuscripto(obs)) {
			this.getSubscribers().add(obs);
		}
		
	}
	
	
	
	public void deSubscribir(Observador obs) {
		
		if (this.estaSuscripto(obs)) {
			this.getSubscribers().remove(obs);
		}
		
	}
	
	public void agregarArticulo(Articulo art) {
		
		this.getArticulos().add(art);
		this.notificarSubidadDeArticulo(art);
		
		
	}
	
	
	public void notificarSubidadDeArticulo(Articulo art) {
		
		for (Observador subscriber : subscribers) {
			subscriber.notificar(this, art);
		}
		
		
	}
	
	
	
	
	
	
}
