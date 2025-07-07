package _13_list._01_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class List8 {
    public static void main(String[] args) {

        ArrayList<Double> doubleArrayList = new ArrayList<>(Arrays.asList(3.5, 6.0, 54.2, 4.89, 23.0));

        ArrayList<Integer> sortedNumber = new ArrayList<>();

        for (double num : doubleArrayList) {
            if (num % 1 == 0) {
                sortedNumber.add((int) num);
            }
        }
        System.out.println(sortedNumber);

        System.out.println("_____________________");


        for (int i = 0; i < doubleArrayList.size(); i++) {
            if (doubleArrayList.get(i) % 1 == 0) {
                sortedNumber.add(doubleArrayList.get(i).intValue());
            }
            break;
        }
        System.out.println(sortedNumber);

    }
}