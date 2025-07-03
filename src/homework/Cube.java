package homework;

public class Cube {
    public static void main(String[] args) {

        int a = 1;
        int b = 6;

        for (int i = a; i <= b; i++) {
            System.out.printf("Number is: " + i + " and cube of 1 is: %.0f \n", Math.pow(i, 3));
        }


        for (int i = 2; i <= 2; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }


//        int sum = 0;
//        System.out.println("The odd numbers are: ");
//        for (int i = 0; i <= 9; i++) {
//            int result = i % 2;
//            if (result != 0) {
//                System.out.println(i);
//                sum += i;
//            }
//
//        }
//        System.out.println("The Sum of odd Natural Number up to 5 terms is: " + sum);

    }
}