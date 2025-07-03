package _03_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MyFirstProgram {
    public static void main(String[] args) {

        // variable - переменная -> primitive data types
        //int num = 90;

        // object -> NON primitive data types
        //Scanner input = new Scanner(System.in);


//        System.out.println("Whats your name ?");
//        String name = new Scanner(System.in).nextLine();
//
//        System.out.println("How old are you?");
//        int age = new Scanner(System.in).nextInt();
//
//        System.out.println("Whats your weight ?");
//        float weight = new Scanner(System.in).nextFloat();
//
//        System.out.println("Whats your height ?");
//        float height = new Scanner(System.in).nextFloat();
//
//        System.out.println("Your name is: " + name + "\n" + "Age: " + age + "\n" +
//                "Weight: " + weight + "\n" + "Height: " + height);

//        Java -> библиотека (формула)
//        Scanner это класс, который храниться в библиотеке
//        у него своя формула на 3077 строк
//        нужно создать сначала его объект.
//        Сначала нужно вызвать его идентификатор, например input.nextByte() и т.д.
//        nextChar (не используется в Сканере)
//        для String используется - next(), nextLine()


//        System.out.println("Введите градусы в Цельсиях: ");
//        double celsius = new Scanner(System.in).nextDouble();
//        double res = celsius * 1.8 + 32;
//        System.out.println("Температура по Фаренгейту: " + res);

        int attempts = 3;
        for (int i = 0; i < attempts; i++) {

            System.out.print("Enter your username: ");
            String user_name = new Scanner(System.in).nextLine();

            System.out.print("Enter your password: ");
            int pass = new Scanner(System.in).nextInt();

            if (user_name.equals("Admin") && pass == 123) {
                System.out.println("Welcome to system!");
                break;
            } else {
                System.out.println("Try again. Incorrect username or password!");
            }
        }
    }
}

