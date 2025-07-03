package _02_java_operators;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {


        // && means AND
        // || means OR
        // ! means NOT

//      if, else, else if ---- >, <, ==, >=, <=, !=, switch - case
//      Логическое И обозначается &&
//      Логическое ИЛИ обозначатся ||

        System.out.println("First: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Second: ");
        int b = new Scanner(System.in).nextInt();

        if (a > 5 && b < 5) {
            System.out.println("Hello world!");
        }
        if (a < 5 && b > 5) {
            System.out.println("Goodbye world");
        }
        if (a > 5 || b < 5) {
            System.out.println("Good job!");
        }
//        &&                     ||
//    t  t  = t              t    t  =  t
//    t  f  = f              t    f  =  t
//    f  t  = f              f    t  =  t
//    f  f  = f              f    f  =  f

    }

}
