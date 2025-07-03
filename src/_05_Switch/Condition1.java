package _05_Switch;

import java.util.Scanner;

public class Condition1 {
    public static void main(String[] args) {

// java syntax
        // projects, class              -> A-Z, $, _
        // variables, methods, packages -> a-z, $, _
        // class "Hello" == file "Hello.java"
        // key words:
        // 50 >
        // public, class, void, static, new, if, else, primitive data types
        // special characters:
        // !, 0, K, ?, G
        // \t, \b, \", \\, \f
        // white
        // System.out.print.   -> same line
        // System.out.println. -> new line
        //
        // red
        // System.err.print.   -> same line
        // System.err.println. -> new line
        // variable -> primitive data types (String)
        int num1;
        num1 = 89;
        num1 = 78;
        int num2 = 56;
        // object -> NON-primitive data types & new
        Scanner scanner = new Scanner(System.in);
        String name = "James";
        String fullName = new String("James Bond");
        // java operators:
        // 1.Arithmetic operators -> +, -, *, /, %, ++, --
        //                        -> / - result
        //                        -> % - remainder
        //                        -> prefix. -> ++num, --num -> сразу добавляет
        //                        -> postfix -> num++, num-- -> добавляет и держит в уме фактический результат, а возвращает старый резульат
        // 2.Assignment operators -> =, +=, -=, *=, /=, %=
        // 3.Comparison operators -> [==, !=]      [>, >=]      [<,  <=]
        // 4.Logical operators.   -> [&& - and (false)],         [|| - or (true)],       [!]
        // if-else statement
//        int wheels = scanner.nextInt();
//        if (wheels == 4){ // true
//            System.out.println("drive");
//        } else {
//            System.out.println("STOP");
//        }
        int season = scanner.nextInt();
        int month;
        if (season == 1){
            System.out.println("Winter");
            month = scanner.nextInt();
            if (month == 1){
                System.out.println("December");
            } else if (month == 2) {
                System.out.println("January");
            } else if (month == 3) {
                System.out.println("February");
            } else {
                System.out.println("No winter");
            }
        } else if (season == 2) {
            System.out.println("Spring");
        } else if (season == 3) {
            System.out.println("Summer");
        } else if (season == 4){
            System.out.println("Fall");
        } else {
            System.out.println("No season");
        }

    }

}

