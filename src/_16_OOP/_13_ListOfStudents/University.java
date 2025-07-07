package _16_OOP._13_ListOfStudents;

import java.util.*;

public class University {

    private String name;
    private Map<String, String> students = new TreeMap<>();
    private Map<String, String> teachers = new TreeMap<>();

    public University(String name) {
        this.name = name;
    }

    public void addStudent(Student student, String faculty) {
        students.put(student.getName(), faculty);
    }

    public void addTeacher(Teacher teacher, String faculty) {
        teachers.put(teacher.getName(), faculty);
    }

    public Map<String, String> getStudents() {
        return students;
    }

    public Map<String, String> getTeachers() {
        return teachers;
    }

    public String getName() {
        return name;
    }
}
