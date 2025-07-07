package _11_Arrays;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        String color1 = "Yellow";
        for (int i = 0; i < color1.length(); i++) {
            System.out.println(color1.charAt(i) + " ");
        }
        System.out.println();

        String cities[] = {"Bishkek", "Tashkent", "London", "Paris"};
        System.out.println(Arrays.toString(cities));
        System.out.println(cities[3]);
        cities[1] = "Almaty";

        System.out.println("----------------");

        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);

        }
        System.out.println("_____________");
        for (String city : cities) {
            System.out.println(city);
        }

        int phone_codes[] = {555, 557, 559, 777, 772};
        for (int i = 0; i < phone_codes.length; i++) {
            String result = String.valueOf(phone_codes[i]);
            if (result.startsWith("5")) {
                System.out.println(phone_codes[i] + " Megacom");
            } else {
                System.out.println(phone_codes[i] + " Beeline");
            }
        }

        int numbers[] = {7, 2, 9, 1, 8, 2, 2};
        for (int i = 0; i < numbers.length; i++) {

            String result = Arrays.toString(numbers);
            String replace = result.replace("2", "0");
            System.out.println(replace);
        }
    }

}