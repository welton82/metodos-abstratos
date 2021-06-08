package program;

import entities.Circle;
import entities.Color;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int op = 1;
        Scanner scan = new Scanner(System.in);
        List<Shape> lista = new ArrayList<Shape>();



        while(op!=0){
            System.out.println("==== MENU =======");
            System.out.println("1 - Inserir retangulo");
            System.out.println("2 - Inserir circulo");
            System.out.println("3 - Listar");
            System.out.println("0 - Sair");
            System.out.print("Operação: ");
            op = scan.nextInt();
            scan.nextLine();
            switch(op){
                case 1:
                    System.out.print("Informe altura Retangulo: ");
                    double alt = scan.nextDouble();
                    System.out.print("Informe largura: ");
                    double lar = scan.nextDouble();
                    scan.nextLine();
                    System.out.print("Informe a Cor RED - BLUE - BLACK: ");
                    String color = scan.next();
                    Rectangle r = new Rectangle(Color.valueOf(color), lar, alt);
                    lista.add(r);
                    break;
                case 2:
                    System.out.print("Raio do circulo: ");
                    double raio = scan.nextDouble();
                    scan.nextLine();
                    System.out.print("Informe a Cor RED - BLUE - BLACK: ");
                    color = scan.next();
                    Circle c = new Circle(Color.valueOf(color),raio);
                    lista.add(c);
                    break;

                case 3:
                    System.out.println("========== MOSTRANDO LISTA DE ÍTENS ===========");
                    for(Shape x: lista){
                        System.out.println(x.getColor() + " " + String.format("%.2f",x.area()));
                    }


                    break;
                case 0:
                    System.out.println("Você escolheu Sair!");
                    break;
                default:
                        System.out.println("Oção inválida!\n");
                    break;
            }

        }


    }
}
