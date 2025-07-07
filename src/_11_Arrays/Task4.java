package _11_Arrays;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

//        int[] nums = {12, 45, 10, 3, 14};
//        System.out.println(Arrays.toString(nums));
//        System.out.println(Arrays.binarySearch(nums, 14));
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
//
//        System.out.println(Arrays.binarySearch(nums, 3));
//
        char[] ch = {'K', 't', '}', '5', '%', '$'};
        System.out.println(ch);

//        Arrays.sort(ch);
//        System.out.println(ch);


        int[] numbers = {1, 2, 2, 3, 4, 5, 3, 6, 5, 7};


        uniqueArray(numbers);


    }

    public static void changeArr(char[] symbols) {
        for (int i = 0; i < symbols.length; i++) {
            String str = String.valueOf(symbols);
            if (!Character.isLetterOrDigit(symbols[i])) {
                symbols[i] = '0';
            }
        }
        System.out.println(symbols);
    }
    public static void uniqueArray(int[] array) {
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {

            int count = 0;
            for (int j = 0; j < array.length; j++) {
                //        1          10
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(array[i] + " ");
            }
        }
    }

//private static int twice (int[] array) {
//    for (int i = 0; i < array.length; i++) {
//        boolean alreadyPrinted = false;
//
//        // Проверяем: встречалось ли это число раньше?
//        for (int j = 0; j < i; j++) {
//            if (array[i] == array[j]) {
//                alreadyPrinted = true;
//                break;
//            }
//        }
//        // Если не встречалось — выводим
//        if (!alreadyPrinted) {
//            System.out.print(array[i] + " ");
//        }
//    }
//}



}