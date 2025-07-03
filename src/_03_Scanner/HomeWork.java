package _03_Scanner;

import java.util.Scanner;

public class HomeWork {
    public static final String RESET  = "\u001B[0m";
    public static final String PURPLE = "\u001B[35m";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Фамилия, имя, отчество: ");
        String name = input.nextLine();

        System.out.println("Дата рождения: ");
        String date = input.nextLine();

        System.out.println("Домашний адрес: ");
        String address = input.nextLine();

        System.out.println("Телефон (мобильный): ");
        long phone = input.nextLong(); input.nextLine();

        System.out.println("Адрес электронной почты: ");
        String mail = input.nextLine();

        System.out.println("Как часто вы посещаете Барбершоп? ");
        String visit = input.nextLine();

        System.out.println("Каких мастеров посещаете? ");
        String master = input.nextLine();

        System.out.println("Откуда узнали о нашем Барбершопе? ");
        String resource = input.nextLine();

        System.out.println("Какую услугу Вам бы хотелось добавить? ");
        String service = input.nextLine();

        System.out.println("Посещает ли наш Барбершоп кто-нибудь из Ваших родственников? ");
        String members = input.nextLine();

        System.out.println("Важна ли для Вас возможность расплатиться за услуги картой? ");
        String card = input.nextLine();

        System.out.println("Покупаете ли Вы в Барбершопе укладочные средства, крема и шампуни и если нет, то почему? ");
        String shopping = input.nextLine();

        System.out.println("\n\t*** АНКЕТА ***\n");

        System.out.println("1. Фамилия, имя, отчество: " + PURPLE + name + RESET);
        System.out.println("2. Дата рождения: " + PURPLE + date + RESET);
        System.out.println("3. Домашний адрес: " + PURPLE + address + RESET);
        System.out.println("4. Телефон (мобильный): " + PURPLE + phone + RESET);
        System.out.println("5. Адрес электронной почты: " + PURPLE + mail + RESET);
        System.out.println("6. Посещение Барбершопа: " + PURPLE + visit + RESET);
        System.out.println("7. Часто посещаемый мастер: " + PURPLE + master + RESET);
        System.out.println("8. Информация о Барбершопе: " + PURPLE + resource + RESET);
        System.out.println("9. Дополнительные услуги: " + PURPLE + service + RESET);
        System.out.println("10. Посещение родственников: " + PURPLE + members + RESET);
        System.out.println("11. Важность оплаты картой: " + PURPLE + card + RESET);
        System.out.println("12. Покупки в Барбершопе: " + PURPLE + shopping + RESET);

    }
}
