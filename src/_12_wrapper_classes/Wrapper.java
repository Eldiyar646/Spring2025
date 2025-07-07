package _12_wrapper_classes;

public class Wrapper {
    public static void main(String[] args) {

         /*
        Primitive DT:           Non-primitive DT:\
                                 String
                                 StringBuilder
                                 StringBuffer
                                 Scanner

                                 Wrapper Classes
        byte,                    Byte
        short,                   Short
        int,                     Integer
        long,                    Long
        float,                   Float
        double,                  Double
        char,                    Character
        boolean,                 Boolean
        */

        byte num1 = 90;
        Byte num2 = 89;
        Byte num3 = 56;
        System.out.println(num1);
        System.out.println(num2);

        int num4 = 37;

        Integer num5 = 29;
        Float num7 = 20f;
        System.out.println(num5.equals(29));
        System.out.println(num5.equals(num4));

        num5.toString().toUpperCase();

        Integer num6 = 37;
        num6.byteValue();

        System.out.println(Integer.max(23, 89));

    }
}
