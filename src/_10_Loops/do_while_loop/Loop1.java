package _10_Loops.do_while_loop;

import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {

        numbers();

        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }

        int count = 0;
        while (count < 3) {
            System.out.println(count);
            count++;
        }
        System.out.println("------------");


        int j = 0;
        do {
            System.out.println(j); // 0
            j++; // 1, 2
        } while (j < 2);

        System.out.println("------------");


        int p = 0;
        do {
            System.out.println(p); // 0
            p++; // 1
        } while (p > 2);

    }

    public static void numbers() {

        Scanner scanner = new Scanner(System.in);

        int i = 0; // counter
        while (i < 3) {
            System.out.println(" vvedite chislo");
            int user_num = scanner.nextInt();                //  2442
            //                                                   0123   4
            String numtostring = String.valueOf(user_num);   // "2442"
            //                     4 >= 4
            if (numtostring.length() >= 4) {                 // 4
                if (numtostring.length() % 2 == 0) {         // length -> even number
                    if (user_num % 2 == 0) {                 // 2442   -> even number
                        //                                   0, 2
                        String half1 = numtostring.substring(0, numtostring.length() / 2); // (0, 2) -> 24
                        //                                                            2
                        StringBuilder half2 = new StringBuilder(numtostring.substring(numtostring.length() / 2)); // (2) -> 42
                        half2.reverse(); // 24
                        //     24   ==  24
                        if (half1.equals(half2.toString())) {
                            System.out.println("zerkalnye chisla");
                        } else {
                            System.out.println(user_num + " ne zerkalnoe chislo");
                        }
                    } else {
                        System.out.println(user_num + " ne chetnoe chislo");
                    }
                }
            } else {
                System.out.println(user_num + " Dlina xbckf yt chetnoe chislo ");
            }
            i++;
        }
    }
}