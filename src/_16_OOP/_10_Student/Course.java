package _16_OOP._10_Student;

import java.util.List;

public class Course {

    public List<Student> students;

    public Course(List<Student> students) {
        this.students = students;
    }

    public void printStudents(){
        for (Student student : students){
            System.out.println(student.name);
        }
    }
}
