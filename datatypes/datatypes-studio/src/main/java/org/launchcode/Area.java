package org.launchcode;
import java.util.Scanner;


public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        while (true); {
            System.out.println("Enter radius: ");
            if (input.hasNextDouble()) {
                Double radius = input.nextDouble();

                if (radius >= 0) {
                    return;
                } else {
                    System.out.println("Radius cannot be negative! Try again!");
                }

                if (Double.isNaN(radius)) {
                    System.out.println("Input is not a number! Try again!");
                }

                Double area = Circle.getArea(radius);
                System.out.println("The area of a circle of radius " + radius + "is: " + area);

            }

        }






//
//        if (Double.isNaN(radius)) {
//            System.out.println("Not a valid input!");
//            return;
//        }






        System.out.println("The area of a circle of radius " + radius + " is: " + area);


    }
}
