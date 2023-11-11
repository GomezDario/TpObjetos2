package ar.edu.unq.po2.tp12.articulo;

import java.util.List;
import java.util.ArrayList;


public class Articulo {

	private String titulo;
	private List<String> autores;
	private String filiacion;
	private String tipoArticulo;
	private String lugarPublicacion;
	private List<String> palabrasClave;
	
	
	public Articulo(String titulo, List<String> autores, String filiacion, String tipoArticulo, String lugarPublicacion,
			List<String> palabrasClave) {
		super();
		this.titulo = titulo;
		this.autores = autores;
		this.filiacion = filiacion;
		this.tipoArticulo = tipoArticulo;
		this.lugarPublicacion = lugarPublicacion;
		this.palabrasClave = palabrasClave;
	}
	
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public List<String> getAutores() {
		return autores;
	}
	public void setAutores(List<String> autores) {
		this.autores = autores;
	}
	public String getFiliacion() {
		return filiacion;
	}
	public void setFiliacion(String filiacion) {
		this.filiacion = filiacion;
	}
	public String getTipoArticulo() {
		return tipoArticulo;
	}
	public void setTipoArticulo(String tipoArticulo) {
		this.tipoArticulo = tipoArticulo;
	}
	public String getLugarPublicacion() {
		return lugarPublicacion;
	}
	public void setLugarPublicacion(String lugarPublicacion) {
		this.lugarPublicacion = lugarPublicacion;
	}
	public List<String> getPalabrasClave() {
		return palabrasClave;
	}
	public void setPalabrasClave(List<String> palabrasClave) {
		this.palabrasClave = palabrasClave;
	}

	
	
	
	
	
}
