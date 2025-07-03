package homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SumAndAverage {
    public static void main(String[] args) {

//        int sum = 0;
//        int count = 2;
//        for (int i = 0; i < count; i++) {
//            System.out.println("Enter number(" + i + "): ");
//            sum += new Scanner(System.in).nextInt();
//        }
//
//        System.out.println("The sum of 5 is: " + sum);
//        System.out.println("The average is: " + (sum) / count);

        int[] number = new int [2];
        for (int i = 0; i < number.length; i++) {
            //number[i] = i + 1;
            System.out.println("Enter number: ");
            number[i] = new Scanner(System.in).nextInt();

//           System.out.println(number[i]);
        }

        System.out.println("The sum is: " + Arrays.stream(number).sum());
        System.out.println("The average is: " + Arrays.stream(number).average());
    }
}
