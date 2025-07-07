package _13_list._01_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class List5 {
    public static void main(String[] args) {
//выводим согласные буквы из введенного слова

//        char[] ch = {'а', 'о', 'у', 'э', 'и', 'ы'};
//
        Scanner text = new Scanner(System.in);
//        System.out.println("Введите слово или текст: ");
//        String input = text.nextLine().toLowerCase();
//        int count = 0;
//
//        for (int i = 0; i < input.length(); i++) {
//            char symbols = input.charAt(i);
//            for (char ch2 : ch) {
//                if (ch2 == symbols) {
//                    System.out.println(ch2 + " ");
//                    count++;
//                    break;
//                }
//            }
//        }
//        System.out.println("Количество " + count);

        // Пользо-ль вводит трех значное число, сумму вывести.

//        System.out.println("Введите число: ");
//        int num = text.nextInt();
//
//        String numStr = String.valueOf(Math.abs(num)); // На случай отрицательных чисел
//        int sum = 0;
//        for (int i = 0; i < numStr.length(); i++) {
//            sum += Character.getNumericValue(numStr.charAt(i));
//        }
//            System.out.println(sum);


        // создать массив который будет искать два числа который в сумме дает 9 {2,4,3,5,7}

//            int[] number = {2, 4, 3, 5, 7, 1, 8};
//            int target_sum = 9;
//            System.out.println("pairs of numbers " + target_sum + " : ");
//
//            for (int i = 0; i < number.length; i++) {
//                for (int j = 0; j < i; j++) {
//                    if (number[i] + number[j] == target_sum) {
//                        System.out.println(number[i] + " + " + number[j] + " = " + target_sum);
//                    }
//
//                }
//            }
        System.out.println("Введите число,длина массива");
        int lengthOfArray = text.nextInt();
        text.nextLine();

        String[] newArray = new String[lengthOfArray];

        for (int i = 0; i < lengthOfArray; i++) {
            System.out.println("Введиите слово");
            String word = text.nextLine();

            if (word.equalsIgnoreCase("stop")) {
                break;
            }
            newArray[i] = word;
        }
        System.out.println(Arrays.toString(newArray));
    }

}