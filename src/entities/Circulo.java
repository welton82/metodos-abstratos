package entities;

import enums.Color;

public class Circulo extends AbstractShappe{
	private Double area;

	public Circulo(Double area, Color color) {
		super(color);
		this.area = area;
	}

	

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(area, 2);
	}
	
	
}
