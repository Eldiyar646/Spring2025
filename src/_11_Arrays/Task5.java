package _11_Arrays;

import java.util.Arrays;

//        count positive & negative & zero
//        [12, 68, 0, -34, 0, 24, 12, 0, -5]
//        отрицательные числа - 2
//        нули - 3
//
//        [12, 68, 0, -34, 0, 24, 12, 0, -5]
//        положительные числа - 4 : 12, 68, 24, 12
//        отрицательные числа - 2 : -34, -5
//        нули - 3                : 0, 0, 0

public class Task5 {
    public static void main(String[] args) {
        int[] arr = {12, 68, 0, -34, 0, 24, 12, 0, -5};
        Arrays.sort(arr);
        System.out.print("Числа отсортированы: " + Arrays.toString(arr) + "\n\n");
        countArray(arr);
    }

    public static void countArray(int[] arr) {

        int count1 = 0, count2 = 0, count3 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count3++;
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("положительные числа: " + count3);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count1++;
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("отрицательные числа: " + count1);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count2++;
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("нули: " + count2);
    }
}