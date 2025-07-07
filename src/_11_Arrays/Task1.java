package _11_Arrays;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        //             0123. 4
        String name = "John"; // --> ['J', 'o', 'h', 'n']
        System.out.println(name);

        // 1. Same data types
        // 2. Fixed size ---> размер нужно указать

        char[] symbol = new char[4];
        symbol[0] = 'J';
        symbol[1] = 'o';
        symbol[2] = 'h';
        symbol[3] = 'n';
        System.out.println(symbol[2]);

        char[] name2 = {'C', 'l', 'a', 'r', 'k'};
        System.out.println(name2[2]);

        int [] nums = {12, 45, 23, 10};
        System.out.println(nums[2]);
        System.out.println(Arrays.toString(nums));
        nums[3] = 100;
        System.out.println(Arrays.toString(nums));


        double price [] = {200,150.50, 120.34, 100.20};
        System.out.println(Arrays.toString(price));
        price[2] = 130.34;
        System.out.println(Arrays.toString(price));

        String colors [] = new String [3];
        colors[0] = "Green";
        colors[1] = "Pink";
        colors[2] = "Gray";
        System.out.println(Arrays.toString(colors));
        colors[1] = "Purple";
        System.out.println(Arrays.toString(colors));
        System.out.println(colors[1]);

        int numbers[] = new int[5];
        numbers[0] = 12;
        numbers[1] = 34;
        numbers[2] = 56;

        System.out.println(Arrays.toString(numbers));






    }



}
