package org.launchcode;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  // What does this do?

        System.out.println("Enter a radius:"); // Explain system out vs system in

        double radius = input.nextDouble(); // What does .nextDouble means
        double area = Circle.getArea(radius);

        System.out.println("The area of a circle with a radius of " + radius + " is " + area);

        input.close(); // is this required?

    }

}
