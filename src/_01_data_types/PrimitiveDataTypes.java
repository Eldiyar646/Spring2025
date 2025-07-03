package _01_data_types;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

//        byte b = 12;
//        short sh = 12345;
//        int i = 959;
//        long l = 123456789;
//        String s = "Eld";
//
//        long l8 = 70;
//        int n9 = (int) l8;
//        int sh4 = (short) n9;
//        byte bb4 = (byte) sh4;
//
//        System.out.println(bb4);
//
//        float f1 = 12.8f;
//        double d1 = 78.5;
//
//        float f2 = f1;
//
//        char c = 43; //кодировка символа
//        char h = 'S';
//
//
//        System.out.println(c);
//        System.out.println(d1);
//
//        System.out.println(i + "\n" + s + "\n" + sh);

        System.out.println("\tЗимнее утро\n" +
                "\tСтихотворение Александра Пушкина\n");

        System.out.println("Мороз и солнце; день чудесный!\n" +
                "Еще ты дремлешь, друг прелестный -\n" +
                "Пора, красавица, проснись:\n" +
                "Открой сомкнуты негой взоры\n" +
                "Навстречу северной Авроры,\n" +
                "Звездою севера явись!");

        System.out.println("==================\n");

        byte b = 10;
        short s = 100;
        int i = 1000;
        long l = 10000;

        long l1 = b;
        int i1 = s;
        short s1 = (short) i;
        byte b1 = (byte) l;

        double d = 1.25;
        float f = 1.35f;

        char c = 'C';
        char ch = 100; //кодировка символа d

        System.out.println(b + "\n" + s + "\n" + i + "\n" + l +
                "\n" + d + "\n" + f + "\n" + c + "\n" + ch
                + "\n" + l1 + "\n" + i1 + "\n" + s1 + "\n" + b1);




    }
}
