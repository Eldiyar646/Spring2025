package _03_Scanner;

import java.util.Scanner;

public class MySecondScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//        int num1 = 30;
//        int num2 = scan.nextInt(); // 50
//        System.out.println(num1);
//        System.out.println(num2); // 50

        //next() -> return first word
        String str1 = scan.next();
        System.out.println(str1);

        scan.nextLine();

        //nextLine() -> return all line
        String str2 = scan.nextLine();
        System.out.println(str2);

    }
}
