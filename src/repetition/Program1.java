package repetition;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {

        // ; используются тут
        int num = 90;
        boolean b = false;
        StringBuilder sb1 = new StringBuilder("Hello");
        Scanner scan = new Scanner(System.in);

        // {} фигурные скобки используются тут
        // class
        // method
        // if / else-if / else
        // switch


        // ()
        // () -> parameters
        // () -> arguments
        // () -> condition

        int age = 15;
        if (age > 18) {
            System.out.println("Adult");
        } else if (age >= 12 && age <= 16) {
            System.out.println("Not");
        } else {
            System.out.println("Teenager");
        }

    }

    //public void toDrive() {

    public void sum (int num1, int num2){
        System.out.println(num1 + num2);
    }

}

// всегда нужно использовать разделители методов, по
// данному примеру машина должна сначала поехать Драйв
// а потом должно остановиться Брейк
//public void toBrake() {
//toDrive(); //может быть такое что метод
// может быть внутри метода