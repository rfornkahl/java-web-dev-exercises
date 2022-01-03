package exercises.studio;

import java.util.Scanner;

public class areaofacircle {
    public static void main(String[] args){
        double pi = 3.14;
        double radius;
        double area;
        Scanner input;

        input = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        radius = input.nextDouble();

             while (radius <= 0){
            System.out.println("Please provide a positive number radius: ");
           radius = input.nextDouble();
        }

        input.close();

        area = circle.getArea(radius);

        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
