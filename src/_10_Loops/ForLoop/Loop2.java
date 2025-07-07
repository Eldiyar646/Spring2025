package _10_Loops.ForLoop;

public class Loop2 {
    public static void main(String[] args) {
        ladder(5);
        elka(5);
        un_ladder(5);
        //un_ladder2(5);
        two_string("Mac", "Book");

    }

    public static void ladder(int num) {
        //           6    <=  5
        for (int i = 1; i <= num; i++) {
            //           6    <= 5
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                // 1
                // 1 2
                // 1 2 3
                // 1 2 3 4
                // 1 2 3 4 5
                //
            }
            System.out.println();
        }
    }

    public static void elka(int num) {
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= num - i; j++) {
                System.out.print(" "); //если это закоментировать будет треугольник
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void un_ladder(int num) {
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void un_ladder2(int num) {
        for (int i = 5; i >= num - 1; i--) {
            for (int j = 1; j >= num - 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void two_string(String str1, String str2) {
        //           2    <= 2
        for (int i = 0; i <= str1.length() - 1; i++) {
            //                             2.  -> c
            System.out.println(str1.charAt(i));
            //           0.   <= 2
            for (int j = 0; j <= str2.length() - 1; j++) {
                //                           2
                System.out.print(str2.charAt(j) + " ");
            }
            System.out.println();
        }

    }
}

