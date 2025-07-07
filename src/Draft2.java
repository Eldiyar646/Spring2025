import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Draft2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String input = scanner.next();

        int sum = 0;
        for (char c : input.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        System.out.println(sum);

        System.out.println("******************");

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter word: ");
        String inputW = scn.next();

        Set<Character> word = new HashSet<>();
        boolean hasDuplicates = false;

        for (char c : inputW.toCharArray()) {
            if (!word.add(c)) {
                hasDuplicates = true;
                System.out.println("Not unique");
            }
        }
        if (!hasDuplicates) {
            System.out.println("Unique");
        }
    }
}