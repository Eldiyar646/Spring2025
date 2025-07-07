package _11_Arrays;

import java.util.Arrays;

public class New_Arr {

    public static void main(String[] args) {

        String color = "Yellow";
        System.out.println(color);

        //Повторные действия лучше закатывать в цикл

        char symbols[] = new char[color.length()];

        for (int i = 0; i < color.length(); i++) {
            symbols[i] = color.charAt(i);
        }
        System.out.println(Arrays.toString(symbols));
    }
}