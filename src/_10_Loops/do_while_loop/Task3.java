package _10_Loops.do_while_loop;

import java.util.Scanner;

import static java.lang.System.out;

public class Task3 {
    public static void main(String[] args) {
        fibi();
    }

    public static void fibi() {

        out.println("Enter number: ");
        int input = new Scanner(System.in).nextInt();
        out.print("Fibi numbers: ");
        int num1 = 0, num2 = 1;
        for (int i = 0; i <= input; i++) {
            out.print(num1 + ", ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}