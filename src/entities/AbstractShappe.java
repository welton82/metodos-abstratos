package entities;

import enums.Color;
import interfaces.Shappe;

public abstract class AbstractShappe implements Shappe{
	
	private Color color;

	public AbstractShappe(Color color) {
		super();
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
}
