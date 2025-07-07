package _13_list._01_ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class List4 {
    public static void main(String[] args) {

        ArrayList<String> car1 = new ArrayList<>();
        car1.add("Audi");
        car1.add("Fiat");
        car1.add("Bentley");
        car1.add("Lada");
        car1.add("Vaz");

        ArrayList<String> car2 = new ArrayList<>();
        car2.add("Honda");
        car2.add("Toyota");
        car2.add("Lexus");
        car2.add("Lada");
        car2.add("Vaz");

        System.out.println(car1);
        System.out.println(car2);

        ArrayList<String> cars = vehicles(car1, car2);

        System.out.println(cars);
        Collections.sort(cars);
        System.out.println(cars);

    }

    public static ArrayList<String> vehicles (ArrayList<String> car1, ArrayList<String> car2) {
        ArrayList<String> result = new ArrayList<>(car1);
        for (int i = 0; i < car2.size(); i++) {
            String car3 = car2.get(i);
            if(!result.contains(car3)) {
                result.add(car3);
            }
        }
        return result;
    }


}
