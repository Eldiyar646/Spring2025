package _11_Arrays;

import java.util.Arrays;

public class ManyTasks {
    public static void main(String[] args) {


        System.out.println(sumArr(new int[]{1, 2, 3, 4, 5, 6, 7}));
        manualPrintArray();
        sumTwoArray();
        fillArrayAsc();
        fillArray();
        clearArray();
        sumFirstAndLastArrayElement();
        sumArray();


    }

    private static int sumArr(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    private static void manualPrintArray() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]\n");
    }

    private static void sumTwoArray() {
        //            0  1  2  3  4  5    Суммирование значений двух массивов
        int[] arr1 = {1, 4, 5, 7, 2, 2};
        int[] arr2 = {2, 2, 2, 2, 2, 2};
        // изначально res равен {0, 0, 0, 0, 0, 0}
        int[] res = new int[arr1.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = arr1[i] + arr2[i];
        }
        System.out.println(Arrays.toString(res));
    }

    private static void fillArrayAsc() {
        // 0 1 2 3 4 5 6 7 8 9 -->  заполнение массива его же индексами при использовании
        // 0 1 2 3 4 5 6 7 8 9 -->  arr[i] = i;

        // 0 1 2 3 4 5 6 7 8 9 --> индекс заполняется
        // 1 2 3 4 5 6 7 8 9 10 --> числами от 1 до 10 при использовании arr[i] = i + 1;

        // 0 1 2 3 4 5 6 7 8 9 --> индекс заполняется
        // 9 8 7 6 5 4 3 2 1 0 --> перевернутыми числами от 9 до 0 при использовании arr[i] = arr.length - 1 - i;

        // 0 1 2 3 4 5 6 7 8 9 --> индекс заполняется
        // 0 4 8 12 16 20 24 28 32 --> числами шагом в 4 числа от 0 каждый раз увеличивается
        //                             на 4 при использовании arr[i] = i * 4;

        // 0 1 2 3 4 5 6 7 8 9 --> индекс заполняется
        // 3 5 7 9 11 13 15 17 19 --> числами шагом в 2 числа от 1 каждый раз увеличивается
        //                             на 2 при использовании arr[i] = 1 + i * 2;

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - 1 - i;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 5;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void clearArray() {
        int[] arr = {1, 6, 4, 2, 6, 5, 4, 4};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void sumFirstAndLastArrayElement() {
        int[] arr = {1, 6, 4, 2, 2};
        int result = arr[1] + arr[arr.length - 1];
        System.out.println(result);
    }

    private static void sumArray() {
        int[] arr = {1, 6, 4, 2, 2};
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        System.out.println(result);
    }
}
