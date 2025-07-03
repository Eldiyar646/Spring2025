package homework;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {

        System.out.println("Area and perimeter of a circle");

        System.out.println("Enter the radius:");
        double radius = new Scanner(System.in).nextDouble();

        double pi = Math.PI;

        System.out.println("Perimeter is = " + (2 * radius * pi));
        System.out.println("Area is = " + (pi * radius * radius));
    }
}
