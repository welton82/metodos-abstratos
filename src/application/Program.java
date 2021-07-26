package application;

import entities.AbstractShappe;
import entities.Circulo;
import entities.Retangulo;
import enums.Color;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractShappe c = new Circulo(3.5,Color.BLACK);
		Retangulo r = new Retangulo(Color.WHITE, 3.5, 2.0);
		
		
		System.out.println("Cor Circulo: " + c.getColor() + " Area: " + String.format("%.2f", c.area()) );
		System.out.println("Cor Retangulo: " + c.getColor() + " Area: " + String.format("%.2f", r.area()) );
		
	}

}
