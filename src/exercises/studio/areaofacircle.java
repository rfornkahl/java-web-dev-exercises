package exercises.studio;

import java.util.Scanner;

public class areaofacircle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");


        try {
            double radius = Double.parseDouble(input.nextLine());
            double pi = 3.14;
            double area;

            while (radius <= 0) {
                System.out.println("Please provide a positive number radius: ");
               radius = input.nextDouble();
            }
           area = circle.getArea(radius);

            System.out.println("The area of a circle of radius " + radius + " is: " + area);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a numeric value");
        }
        double radius = input.nextDouble();
        double area = circle.getArea(radius);

        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}