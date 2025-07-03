package homework;

public class SumOfDigit {
    public static void main(String[] args) {
        int num = 25;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}
