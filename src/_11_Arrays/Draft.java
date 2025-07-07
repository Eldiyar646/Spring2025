package _11_Arrays;

import java.util.Arrays;

import static java.lang.System.out;

public class Draft {
    public static void main(String[] args) {

        int primitive = 10;
        Integer wrapped = primitive; // autoboxing

        System.out.println("Primitive: " + primitive);
        System.out.println("Wrapped: " + wrapped);

        // использование метода из Integer
        int parsed = Integer.parseInt("123");
        System.out.println("Parsed: " + parsed);

//        int[] nums = {12, 15, 14, 6};
//        int result = 0;
//        for (int num : nums) {
//            result += num;
//        }
//        System.out.println(result);


        //  search_word("lpg");
      //  length();
        length2();

    }

//    private static boolean search_word(String word) {
//        String laptop = "Mac book pro";
//        String[] words = laptop.split(" ");
//        System.out.println(Arrays.toString(words));
//
//        for (int i = 0; i < words.length; i++) {
//            if (words[i].equals(word)) {
//                System.out.println(word + " - yes");
//                return true;
//            }
//        }
//        System.out.println(word + " - no");
//        return false;
//    }

//    Найти строку с максимальной длиной
//    Создать массив из строк и вывести строку с наибольшей длиной среди всех строк.
//
//    Вывести сумму длин всех строк массива
//    Посчитать сумму всех длин строк в массиве.
//
//    Склеить все строки массива в одну
//    Дан массив строк.
//    Склеить все строки в одну большую строку через for-each.
//
//    Вывести только строки, начинающиеся с буквы 'A'
//    Дан массив строк.
//    Вывести только те строки, которые начинаются с 'A'.

    public static void length() {
        String[] first = {"Acura", "Bentley", "Mercedes-Benz", "Porsche", "Audi"};
        String result = first[0];
        StringBuilder res = new StringBuilder();
        int sum = 0;

        for (int i = 0; i < first.length; i++) {
            if (first[i].length() > result.length()) {
                result = first[i];
            }
        }
        out.println("1. Это строка " + result + " ее длина " + result.length());

        for (int i = 0; i < first.length; i++) {
            sum += first[i].length();
            res.append(first[i]);
        }
        out.println("2. Длина строки: " + sum);
        out.println("3. Строки склеены: " + res);

        out.print("4. Cтроки на А: ");
        for (int i = 0; i < first.length; i++) {
            if(first[i].startsWith("A") || first[i].startsWith("a") ) {
                out.printf(first[i] + " ");
            }
        }

        out.println();
    }

    public static void length2() {
        String[] first = {"Acura", "Bentley", "Mercedes-Benz", "Porsche", "Audi"};
        Arrays.sort(first);
        out.println(Arrays.toString(first));
        out.println(Arrays.binarySearch(first, "Audi"));
// Распечатает       [Acura, Audi, Bentley, Mercedes-Benz, Porsche]

    }
}