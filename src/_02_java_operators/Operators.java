package _02_java_operators;

public class Operators {
    public static void main(String[] args) {

        // +
        System.out.println(89 + 10);

        // -
        System.out.println(34 - 12);

        // *
        System.out.println(2 * 2);

        // / -> результат (деление)
        int num1 = 4;
        int num2 = 2;
        int result = num1 / num2;
        System.out.println(result);

        int num3 = 5;
        int num4 = 2;
        int result2 = num3 / num4;
        System.out.println(result2);

        // % -> остаток от деления
        int result3 = num3 % num4;
        System.out.println(result3);

        double num5 = 34.2;
        double num6 = 3.7;
        double result4 = num5 / num6;
        double result5 = num5 % num6;
        System.out.println(result4);
        System.out.println(result5);

        // ++
        // prefix --> ++num7
        int num7 = 1;
        System.out.println(++num7); // 2
        System.out.println(++num7); // 3
        System.out.println(++num7); // 4

        // postfix --> num8++ возращает старый в уме держт новый
        int num8 = 1;
        System.out.println(num8);   // 1
        System.out.println(num8++); // 1 [2]
        System.out.println(num8++); // 2 [3]
        System.out.println(num8++); // 3 [4]
        System.out.println(num8++); // 4 [5]
        System.out.println(num8++); // 5 [6]



    }
}
