package _16_OOP._04_Student;

public class Student {

    public int id;
    public String name;
    public String address;
    public int age;

    public Student(String address, String name, int id, int age) {
        this.address = address;
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public void printAll () {
        System.out.println("Студент найден!");
        System.out.println("Имя: " + name);
        System.out.println("Адрес: " + address);
        System.out.println("Возраст: " + age);
        System.out.println("ID: " + id);
    }




// constructor -> nameOfClass, no: void/return
    // method      -> anyName,     yes: void/retern
}