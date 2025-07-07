package _10_Loops.WhileLoop;

import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {

        zeroInt();
        number();

    }


//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }

//        int count = 1;
//        //       1, 2, 3
//        while (count <= 3) {
//            System.out.println(count + "***");
//            // 1***
//            // 2***
//            // 3***
//            count++; // 2, 3
//        }
//
//        //  while (2 < 5) {
//        //      System.out.println("%%%");
//        //  } плохой пример
//
//
//        count = 5;
//        while (count >= 1) {
//            System.out.println(count + "&&&&");
//            count--;  //обратный отсчет
//        }
//    }


    public static void zeroInt() {
        Scanner scan = new Scanner(System.in);
        int num;
        String numbers = "";

        while (true) {
            num = scan.nextInt();
            if (num == 0) {
                break;
            }
            numbers += num + " ";
            System.out.println(num);

        }
        System.out.println(numbers + num);

    }

    public static void number(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); // 5113

        String str = String.valueOf(num); // "5113" Создали стринг для конвертации числа в строку
        char symbol; // str -> 5 1 1 3 для того чтобы по отлельности можно было сохранять число
        int sum = 0; // 5+1+1+3  = 10
        int i = 0; // создали для счетчика, старт цикла
        //     1 < 4
        while (i < str.length()){ // str.length() конец счетчика
            //                  3
            symbol = str.charAt(i); // '3'
            //    getNumericValue() из символа возьми числовое значение
            sum += Character.getNumericValue(symbol); // 0 + 5= 5 + 1= 6 + 1=7 + 3=10
            i++; // 2
        }
        System.out.println(sum); // 10
    }
}



