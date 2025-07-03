package homework;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {

        System.out.println("Enter number: ");
        int day = new Scanner(System.in).nextInt();

        String dayString;

        switch (day) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString = "Sunday";
                break;
            default:
                dayString = "Error";
                break;
        }
        System.out.println(dayString);
    }
}
