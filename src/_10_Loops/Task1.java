package _10_Loops;

public class Task1 {
    public static void main(String[] args) {



        fizz();
        System.out.println("***********\n");
        squre();
        System.out.println("***********\n");
        three();

    }

    public static void fizz() {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }
                System.out.println(i);
            }
        }

    public static void squre() {
        for (int i = 0; i <= 10; i++) {
            if (i >0)
            System.out.printf("Квадрат числа " + i + " это %.0f \n", Math.pow(i, 2));
        }
    }

    public static void three() {
        for (int i = 0; i <= 12; i++) {
            if (i % 3 == 0 && i > 0) {
                System.out.println(i);
            }
        }
    }
}
