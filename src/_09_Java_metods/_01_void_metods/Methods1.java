package _09_Java_metods._01_void_metods;

public class Methods1 {
    public static void main(String[] args) {
        Methods1 obj = new Methods1();

        obj.checkPalindromeWord(); //kayak
        System.out.println("___________________");
    }

    public void checkPalindromeWord() {
        String word = "1551";
        StringBuilder sb1 = new StringBuilder(word);

        if (word.equals(sb1.reverse().toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("is not a Palindrome");
        }
    }
}