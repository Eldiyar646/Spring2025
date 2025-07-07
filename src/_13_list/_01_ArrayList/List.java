package _13_list._01_ArrayList;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {

        //String -> Stringbuilder
        //Arrays -> ArrayList


        //Non-generic type - не указываем конкретный тип, динамичный массив
        ArrayList elements = new ArrayList();
        elements.add(12); // Integer n =5;
        elements.add(true);
        elements.add("Hello");
        elements.add('P');
        System.out.println(elements);

        // Generic type
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(19); // 19, 57 это объект под капотом, а не переменные
        numbers.add(57);
        numbers.add(22);
        System.out.println(numbers);

        ArrayList<String> name_list = new ArrayList<>();
        name_list.add("Will");
        name_list.add("James");
        name_list.add("John");
        name_list.add("Clark");
        System.out.println(name_list);

        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println(name_list.get(2));

        int n1 = 77;
        int n2 = numbers.get(1);
        System.out.println(n2);

        Integer d1 = 78;
        int d2 = d1;

        ArrayList<String> list_color = new ArrayList<>();
        list_color.add("purple");
        list_color.add("black");


        ArrayList<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("green");
        colors.add("pink");
        colors.add(0, "red");
        colors.addAll(1, list_color);
        // [red, purple, black, white, green, pink]
        System.out.println(colors.get(3));
        System.out.println(colors.size());
        System.out.println(colors.remove(4));
        System.out.println(colors.remove("black"));
        System.out.println(colors.removeAll(list_color));
        System.out.println(colors.isEmpty());
        System.out.println(colors);


        ArrayList<String> carsList = new ArrayList<>();
        carsList.add("Audi");
        carsList.add("Fiat");
        carsList.add("Lada");
        carsList.add("Ford");

        for (int i = 0; i < carsList.size(); i++) {
            if (carsList.get(i).equalsIgnoreCase("audi")) {
                carsList.remove(i);
            }
        }
        System.out.println(carsList);

    }
}
