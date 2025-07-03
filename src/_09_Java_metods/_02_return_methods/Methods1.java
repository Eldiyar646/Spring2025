package _09_Java_metods._02_return_methods;

import java.util.Scanner;

public class Methods1 {
    public static void main(String[] args) {

        System.out.println("Enter number: ");
        print();
    }

    private static void print() {
        System.out.println(getInput() % 2 == 0);
    }

    private static int getInput() {
        return new Scanner(System.in).nextInt();
    }
}