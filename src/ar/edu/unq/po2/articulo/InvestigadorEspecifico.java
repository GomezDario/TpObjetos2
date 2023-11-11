package ar.edu.unq.po2.tp12.articulo;

import java.util.List;
import java.util.ArrayList;

public class InvestigadorEspecifico implements Observador {

	private List<Articulo> articulosDeinteres;
	private List<String> intereses;
	
	private Publicacion publicacion;
	
	private boolean notificado = false;
	
	
	public InvestigadorEspecifico(Publicacion publicacion, List<String> interes) {
		
		this.setPublicacion(publicacion);
		this.setIntereses(interes);
		this.setArticulosDeinteres(new ArrayList<Articulo>());
		this.publicacion.subscribir(this);
	}

	
	
	
	public Publicacion getPublicacion() {
		return publicacion;
	}

	public void setPublicacion(Publicacion publicacion) {
		this.publicacion = publicacion;
	}

	public List<Articulo> getArticulosDeinteres() {
		return articulosDeinteres;
	}

	public void setArticulosDeinteres(List<Articulo> articulosDeinteres) {
		this.articulosDeinteres = articulosDeinteres;
	}

	public List<String> getIntereses() {
		return intereses;
	}

	public void setIntereses(List<String> intereses) {
		this.intereses = intereses;
	}

	public boolean isNotificado() {
		return notificado;
	}

	public void setNotificado(boolean notificado) {
		this.notificado = notificado;
	}
	
	
	
	

	@Override
	public void notificar(Publicacion publicacion, Articulo articulo) {
		// TODO Auto-generated method stub
		
		if (this.esDeInteres(articulo)) {
			this.getArticulosDeinteres().add(articulo);
			this.setNotificado(true);
		}
		
		
	}


	private boolean esDeInteres(Articulo articulo) {
		// TODO Auto-generated method stub
		
		boolean contieneInteresEnElTitulo = this.getIntereses().stream().anyMatch(interes -> articulo.getTitulo().contains(interes));
		boolean contieneInteresEnElTipo = this.getIntereses().stream().anyMatch(interes -> articulo.getTipoArticulo().contains(interes));
		boolean contieneInteresEnLasKeywords = this.getIntereses().stream().anyMatch(interes -> articulo.getPalabrasClave().contains(interes));
		boolean contieneInteresEnLosAutores = this.getIntereses().stream().anyMatch(interes -> articulo.getAutores().contains(interes));
		
		return contieneInteresEnElTitulo || contieneInteresEnElTipo || contieneInteresEnLasKeywords || contieneInteresEnLosAutores;
	}
	
	}

	
	

	

