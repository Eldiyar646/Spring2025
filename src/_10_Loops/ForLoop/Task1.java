package _10_Loops.ForLoop;

import static java.lang.System.out;

public class Task1 {
    public static void main(String[] args) {

        out.println(makeTwo("Java"));
        out.println(deleteChar("Javellinnesse"));
        out.println(threeCh("Max"));
        out.println(vowel_word("lemarions"));
        out.println(deleteVowels("lemariouns"));
        out.println(makeTwoNonVowels("DogAndCat"));
    }

    public static String makeTwo(String word) {         // удвоить символы
        StringBuilder two_char = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            two_char.append(ch).append(ch);
        }
        return two_char.toString();
    }

    public static String deleteChar(String word) {          //удалить похожие символы
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (res.indexOf(String.valueOf(ch)) == -1) {
                res.append(ch);
            }
        }
        return res.toString();
    }

    public static String threeCh(String word) {           // утроить символы
        StringBuilder double_char = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            double_char.append(ch).append(ch).append(ch);
        }
        return double_char.toString();
    }

    public static String vowel_word (String word) {          //удвоить согласные символы
        StringBuilder result = new StringBuilder();
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            result.append(ch);
            if (vowels.indexOf(ch) != -1) {
                result.append(ch);
                }
        }
        return result.toString();
    }
    public static String deleteVowels(String word) {          //удалить согласные символы
        StringBuilder res = new StringBuilder();
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (vowels.indexOf(String.valueOf(ch)) == -1) {
                res.append(ch);
            }
        }
        return res.toString();
    }

    public static String makeTwoNonVowels(String word) {         // удвоить символы
        StringBuilder two_char = new StringBuilder();
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (vowels.indexOf((ch)) == -1) {
                two_char.append(ch).append(ch);
            } else {
                two_char.append(ch);
            }
        }
        return two_char.toString();
    }
}