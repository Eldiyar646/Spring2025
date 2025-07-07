package homework.ClassWork;

import java.util.Scanner;

public class Peoples {

    String name;
    String gender;
    int age;
    double weight;
    double height;
    String vehicle;


    public Peoples() {
    }

    public Peoples(String name, String gender, int age, double weight, double height, String vehicle) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.vehicle = vehicle;
    }

    public void printAll() {
        System.out.println("Name: " + this.name + "\n" + "Gender: " + this.gender + "\n" + "Age: " + this.age + "\n" +
                "Weight: " + this.weight + "\n" + "Height: " + this.height + "\n" + "Vehicle: " + this.vehicle);
    }

    public void walk() {
        System.out.println("Enter your walk information: ");
        int input = new Scanner(System.in).nextInt();
    }
}