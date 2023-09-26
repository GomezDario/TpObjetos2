package ar.edu.unq.po2.tp3;

public class Rectangulo {

	private Point unPunto;
	
	
	
	
	public Rectangulo(Point unPunto) {
		super();
		this.unPunto = unPunto;
		
	}
	
	
	public Integer elAreaDelRectangulo() {
		
		Integer areaTotal = this.unPunto.getY() * this.unPunto.getX();
		
		return areaTotal;
		
		
		
	}
	
	
	public Integer perimetroTotalDelRectangulo() {
		
		Integer perimetroTotal = this.unPunto.getX()* 2 + this.unPunto.getY() * 2;
		
		return perimetroTotal;
		
		
		
	}
	
	
	public Boolean esUnRectanguloHorizontal() {
		
		return unPunto.getX() > unPunto.getY();
		
	}
	
	
	public Boolean esUnRectanguloVertical() {
		
		
		return unPunto.getY() > unPunto.getX();
		
	}
	
	
	
}
