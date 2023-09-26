package ar.edu.unq.po2.tp3;

public class Point {

	private Integer x;
	private Integer y;
	
	public Point() {
		
		this.x = 0;
		this.y = 0;
		
	}
	
	public Point(Integer x, Integer y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	
	public void moverPuntoX(Integer x) {
		
		this.x = x;
		
		
	}
	
	public void moverPuntoY(Integer y) {
		
		this.y = y;
		
		
	}
	
	
	public Point sumarPunto(Point unPunto) {
		
		Integer ejeX = this.x + unPunto.x;
		Integer ejeY = this.y + unPunto.y;
		
		
	    Point puntoResultante = new Point(ejeX, ejeY);
		
	    return puntoResultante;
	    
		
		
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}
	
	
	
	
	
	
}
