package repetition;

public class Program3 {
    public static void main(String[] args) {
        Program3 obj = new Program3();
//        System.out.println(obj.maxNumber(5, 1));
//        System.out.println(obj.maxNumber(5, 9));

        System.out.println(degree(40));

    }

    public static String degree(int temp) {
        if (temp >= -50 && temp < 0) {
            return "Cold";
        } else if (temp >= 0 && temp < 20) {
            return "Not cold";
        } else if (temp > 20 && temp <= 40) {
            return "Hot";
        } else {
            return "Enter normal temperature";
        }
    }

    public String maxNumber(int num1, int num2) {
        // false
        // 5 > 9
        if (num1 > num2) {
            return "Max number is " + num1;
        } else {
            return "Max number is " + num2;
        }
    }
}