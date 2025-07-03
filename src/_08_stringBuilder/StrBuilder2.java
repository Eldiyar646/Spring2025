package _08_stringBuilder;

import java.util.Scanner;

public class StrBuilder2 {
    public static void main(String[] args) {

        // abituriebnt
        // finansist - contract 40000,
        // yurist - contract 50000
        // esli on vybiraet vinansista take exams po matematica, istoriya, kyrqyzskiy, russkiy
        // esli on vybiraet yurist take exams po istoriya, kyrqyzskiy, russkiy
        // Score - 0-30    -> D
        // Score - 31-50   -> C
        // Score - 51-80   -> B
        // Score - 81-100  -> A skidka 20%


        Scanner scanner = new Scanner(System.in);
        System.out.print("Пожалуйста введите имя: ");
        String fullName = scanner.nextLine();

        System.out.println(fullName.concat(" пожалуйста выберите специальность: ").concat("\n1. Финансист \n2. Юрист"));


        int kg_points = 0, ru_points = 0, math_points = 0, his_points =0;

        int profession = scanner.nextInt();
        if (profession == 1) {
            System.out.println("Пожалуйста введите баллы по кыргызскому языку: ");
            kg_points = scanner.nextInt();
            if (kg_points >= 80 && kg_points <= 100) {
                System.out.println("Экзамен по кыргызскому сдан");
                System.out.println("Пожалуйста введите баллы по русскому языку: ");
                ru_points = scanner.nextInt();
                if (ru_points >= 80 && ru_points <= 100) {
                    System.out.println("Экзамен по рускому сдан");
                    System.out.println("Пожалуйста введите баллы по математике языку: ");
                    math_points = scanner.nextInt();
                    if (math_points >= 80 && math_points <= 100) {
                        System.out.println("Экзамен по математике сдан");
                        System.out.println(fullName.concat(" Вы сдали все экзамены и мы вам проедоставляем Вам 20% скидку"
                                .concat("\nСтоимость контракта на финансиста составляет 40 000 сомю Прошу оплатить " +
                                        "контракт со скидкой 32 000 сом.")));
                        int contract = scanner.nextInt();
                        if (contract == 32000) {
                            System.out.println("Контракт оплачен");
                        } else if (contract > 32000) {
                            System.out.println("Возьмите сдачи - " + (contract - 32000) + "сом.");
                        }else {
                            System.out.println("Не достаточно средств");
                        }
                    }else {
                        System.out.println("Экзамен по математике не сдан");
                    }
                }else {
                    System.out.println("Экзамен по русскому не сдан");
                }
            } else {
                System.out.println("Экзамен по кыргызскому не сдан");
            }
        }else if (profession == 2){
            System.out.println("Пожалуйста введите баллы по кыргызскому языку: ");
            kg_points = scanner.nextInt();
            if (kg_points >= 80 && kg_points <= 100) {
                System.out.println("Экзамен по кыргызскому сдан");
                System.out.println("Пожалуйста введите баллы по русскому языку: ");
                ru_points = scanner.nextInt();
                if (ru_points >= 80 && ru_points <= 100) {
                    System.out.println("Экзамен по рускому сдан");
                    System.out.println("Пожалуйста введите баллы по математике языку: ");
                    his_points = scanner.nextInt();
                    if (his_points >= 80 && his_points <= 100) {
                        System.out.println("Экзамен по истории сдан");
                        System.out.println(fullName.concat(" Вы сдали все экзамены и мы вам предоставляем Вам 20% скидку"
                                .concat("\nСтоимость контракта на юриста составляет 50 000 сом. " +
                                        "Прошу оплатить контракт со скидкой 40 000 сом.")));
                        int contract = scanner.nextInt();
                        if (contract == 40000) {
                            System.out.println("Контракт оплачен");
                        } else if (contract > 40000) {
                            System.out.println("Возьмите сдачи - " + (contract - 40000) + " сом.");
                        }else {
                            System.out.println("Недостаточно средств");
                        }
                    }else {
                        System.out.println("Экзамен по математике не сдан");
                    }
                }else {
                    System.out.println("Экзамен по русскому не сдан");
                }
            } else {
                System.out.println("Экзамен по кыргызскому не сдан");
            }
        } else {
            System.out.println("Выберите из списка.");
        }
    }
}
