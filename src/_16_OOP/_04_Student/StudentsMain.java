package _16_OOP._04_Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentsMain {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Введите свое ID: ");
        String inputID = scn.next();

        Student emir = new Student("Chui 2", "Emir", 123456, 18);
        Student eldiyar = new Student("Manasa 3", "Eldiyar", 234567, 20);
        Student badam = new Student("Mira 4", "Badam", 345678, 23);
        Student bermet = new Student("Semetei 5", "Bermet", 456789 , 15);

        List<Student> listOfStudents = new ArrayList<>(Arrays.asList(emir, eldiyar, badam, bermet));
        boolean isExist = false;

        for (Student str : listOfStudents) {
            if (String.valueOf(str.id).equals(inputID)) {
                str.printAll();

                StudentsAge ageGroup = StudentsAge.findByAge(str.age);
                System.out.println(ageGroup.getValue());

                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Введите правильный ID из 6ти цифр!");
        }
    }
}