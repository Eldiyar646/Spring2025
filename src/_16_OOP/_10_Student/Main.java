package _16_OOP._10_Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student maks = new Student("Maksim");
        Student ali = new Student("Ali");
        Student adam = new Student("Adam");
        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(maks);
        listOfStudents.add(ali);
        listOfStudents.add(adam);

        Course course = new Course(listOfStudents);
        course.printStudents();


    }
}
