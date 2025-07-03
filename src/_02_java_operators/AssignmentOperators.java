package _02_java_operators;

public class AssignmentOperators {
    public static void main(String[] args) {

        // =
        int num = 89;
        System.out.println(num);

        // +=
        num = 12;
        num = 12;
        num = 12;
        num = 23 + 13; // 36

        // 36 - 6 = 30
        num = num - 6;
        //. 30. + 10. = 40
//        num = num + 10;
        num += 10; // num=num+10
        num += 20;
        System.out.println(num); // 60

        // -
        num -= 30;
        num -= 12; // num = num - 12 --> num = 30 -12 --> num = 18
        System.out.println(num); // 18

        // *
        num *= 2;
        System.out.println(num);

        // /
        num /= 4;
        System.out.println(num);

        // %
        num %= 4;
        System.out.println(num);

        // decrement
        int num1 = 10;
        System.out.println(num1--); // 10 [9]
        System.out.println(num1--); // 9 [8]
        System.out.println(num1++); // 8 [9]
        System.out.println(num1); // 9

        System.out.println(!(98 > 90));

        int num5 = -775;
        boolean result5 = num5 != 775 || ((76 * 0) <= (98 / 8)) && num5 >= 0; // true
        System.out.println(result5);


    }
}
