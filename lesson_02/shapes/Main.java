package shapes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(Rectangle.Name);
        System.out.print("Please, enter rectangle's height: ");
        rectangle.setH(new Scanner(System.in).nextInt());
        System.out.print("Please, enter rectangle's width : ");
        rectangle.setW(new Scanner(System.in).nextInt());
        System.out.println("shapes.Rectangle's area = " + rectangle.areaRectangle());

        Triangle triangle = new Triangle();
        System.out.println(Triangle.Name);
        System.out.print("Please, enter triangle's height: ");
        triangle.setH(new Scanner(System.in).nextInt());
        System.out.print("Please, enter triangle's base : ");
        triangle.setA(new Scanner(System.in).nextInt());
        System.out.println("shapes.Triangle's area = " + triangle.areaTriangle());

        Circle circle = new Circle();
        System.out.println(Circle.Name);
        System.out.print("Please, enter circle's radius: ");
        circle.setR(new Scanner(System.in).nextInt());
        System.out.println("shapes.Circle's area = " + circle.areaCircle());
    }

}
