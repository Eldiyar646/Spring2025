package _11_Arrays;

public class Task6 {
    public static void main(String[] args) {

        cityToCountry();
       // piff();
    }


    private static void cityToCountry() {
                                   //    0 - страна                       1 - столица
        String[][] countries = {{"Japan", "China", "USA", "Russia"}, {"Tokyo", "Beijing", "Washington", "Moscow"}};
        for (int i = 0; i < countries[0].length; i++) {
            for (int j = 0; j < countries.length; j++) {
                if (j == 0) {
                    System.out.print(countries[j][i] + " - ");
                } else {
                    System.out.println(countries[j][i]);
                }
            }
        }
    }


    private static void piff() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i > 0 && j > 0) {
                    System.out.printf("%4d", i * j);
                }
            }
            System.out.println();
        }
    }
}