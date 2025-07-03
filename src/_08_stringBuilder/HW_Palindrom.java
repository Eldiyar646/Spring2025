package _08_stringBuilder;

import java.util.Scanner;

import static java.lang.System.out;

public class HW_Palindrom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        out.print("Введите слово: ");
        StringBuilder str1 = new StringBuilder(scanner.nextLine());
        StringBuilder str2 = new StringBuilder(str1).reverse();

        if (str1.toString().equalsIgnoreCase(str2.toString())) {
            out.println(str2.append(" - это слово полиндром!"));
        } else {
            out.println(str2.append(" - это слово не полиндром!"));
        }
//
//           System.out.println("Напишите слово:");
//        StringBuilder word = new StringBuilder(scanner.nextLine());
//        StringBuilder word2 = new StringBuilder(word).reverse();
//        System.out.println(word2);
//        if (word.toString().equalsIgnoreCase(word2.toString())){
//            System.out.println(word +  " это полиндром");
//        }else {
//            System.err.println(word + " это не полиндром");
//        }


    }




}
