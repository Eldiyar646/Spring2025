package _10_Loops.ForLoop;

public class Task2 {
    public static void main(String[] args) {

        System.out.println(secondCh("Mac Book Pro"));
        fBzz();

    }
//                                            0123456789012
// use for loop and find second symbol 'o' -> Mac Book Pro Book
//                                         -> se

    public static String secondCh(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.toLowerCase(c) == 'o')
                count++;
            if (count == 2) return str.substring(i);
        }
        return "нет второго < o >";
    }


    public static void fBzz() {
        boolean isExist = false;

        for (int i = 1; i <= 30; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }

            System.out.println(i);
        }
    }
}