import java.util.Scanner;

public class Draft3 {
    public static void main(String[] args) throws Exception {

        //        System.out.println("Введите 1 число: ");
//        int a = new Scanner(System.in).nextInt();
//        System.out.println("Введите 2 число: ");
//        int b = new Scanner(System.in).nextInt();
//        if (b == 0) {
//            throw new Exception("Делить на ноль нельзя!");
//        }
//        System.out.println(a / b);


        System.out.println("Введите число: ");
        String s = new Scanner(System.in).next();
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new Exception("Введите число а не строку!");
            }
        }
        int num = Integer.parseInt(s);
        System.out.println("Квадрат введенного числа = " + num * num);

//        try {
//            System.out.println("Введите число: ");
//            String s = new Scanner(System.in).next();
//            int i = Integer.parseInt(s);
//            System.out.println(i * i);
//        } catch (NumberFormatException e) {
//            e.printStackTrace();
//            System.out.println("Введите число!");
//        }
    }
}
