package entities;


import java.util.Scanner;

public abstract class Shape {

    private Color color;

    public Shape() {
    }

    public Shape(Color color) {
/*
        while((color != Color.BLUE) || (color != Color.BLACK) || (color != Color.RED)){
            System.out.println("Cores Diferentes Redigite Novamente: ");
            Scanner scan = new Scanner(System.in);
            String col = scan.next();
            color = Color.valueOf(col);
        }*/
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract Double area();
}
