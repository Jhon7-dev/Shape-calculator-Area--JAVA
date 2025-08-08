package application;

import entities.enums.Color;
import model.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Rectangle;
import model.Circle;
public class Program {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();
        System.out.println("Insira o número de formas: ");
        int n = scn.nextInt();

        for (int i = 1;i<=n;i++){
            System.out.println("Forma #" + i  );
            System.out.println("Retângulo ou Ciculo(R/C)?");
            char ch = scn.next().charAt(0);

            System.out.print("COLOR ( BLACK/BLUE/RED): ");
            Color color = Color.valueOf(scn.next());

            if(ch == 'r'){
                System.out.println("LARGURA: ");
                double width = scn.nextDouble();
                System.out.println("ALTURA: ");
                double height = scn.nextDouble();
                list.add(new Rectangle(color,width,height));

            }else{

                System.out.println("RAIO: ");
                double radius = scn.nextDouble();
                list.add(new Circle(color,radius));
            }
        }
        System.out.println();
        System.out.println("ÁREAS: ");
        for(Shape shape : list){
            System.out.println(String.format("%.2f", shape.area()));
        }
    }
}
