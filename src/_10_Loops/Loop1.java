package _10_Loops;


public class Loop1 {
    public static void main(String[] args) {

        ten_times();
        number_three(333);
    }

    public static void ten_times() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }


    public static String number_three(int num) {
        String numToStr = String.valueOf(num);
        if (numToStr.length() == 3) {
            int sum = 0;
            for (int i = 0; i < numToStr.length(); i++) {
                sum += Character.getNumericValue(numToStr.charAt(i));
            }
            System.out.println("Сумма цифр: " + sum);
            return String.valueOf(sum);
        } else {
            return "Число не трёхзначное";
        }
    }
}
