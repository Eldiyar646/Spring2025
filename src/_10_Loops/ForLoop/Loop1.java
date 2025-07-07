package _10_Loops.ForLoop;

import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово или предложение: ");
        String input = scanner.nextLine();
        wordMac(input);

        wordMBP("Mac book pro");

        reverseTheWord(input);
        System.out.println();

        MacPro("Mac Book Pro");


//        for (int i = 0; i <= 5; i++) {
//            System.out.println(i);  // обычный цикл, т.е. увеличивающий с 0 до 5ти
//        }
//        System.out.println("*********");
//
//        for (int i = 5; i >= 0 ; i--) {
//            System.out.println(i); // обратный цикл, т.е. убывающий с 5 до 0
//        }
    }

    public static void wordMac(String word) {
        System.out.println(word.replace(" ", ""));
    }

    public static void wordMBP(String word) {
        String print = "";
        for (int i = 0; i < word.length(); i++) {
            String character = word.substring(i, i + 1);
            if (!character.equals(" ")) {
                print = print + character;
            }
        }
        System.out.println(print);
    }

    public static void reverseTheWord(String word) {
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i));
        }
        System.out.println();

        for (int i = word.length() -1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
    }

    public static void MacPro(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' ') {
                sb.append(word.charAt(i));
            }
        }
        System.out.println(word + "\n" + sb);
    }
}

