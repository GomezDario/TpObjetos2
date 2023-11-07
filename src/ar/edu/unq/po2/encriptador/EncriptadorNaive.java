package ar.edu.unq.po2.tp11;

public class EncriptadorNaive {

	private String palabra;
	private IEncriptacion metodoEncriptacion;
	
	public String encriptacion() {
		
		return metodoEncriptacion.encriptar(this.getPalabra());
		
	}
	
	public String desencriptacion() {
		return metodoEncriptacion.desencriptar(this.getPalabra());
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public IEncriptacion getMetodoEncriptacion() {
		return metodoEncriptacion;
	}

	public void setMetodoEncriptacion(IEncriptacion metodoEncriptacion) {
		this.metodoEncriptacion = metodoEncriptacion;
	}
	
	
	
	
	
	
	
	
	
	
	
}
