package _16_OOP._13_ListOfStudents;

public class Main {
    public static void main(String[] args) {

        University university = new University("Кыргызский национальный университет");

        university.addStudent(new Student("Асанов Асан"), "Факультет международных отношений");
        university.addStudent(new Student("Беков Бек"), "Факультет международных отношений");
        university.addStudent(new Student("Васин Вася"), "Факультет международных отношений");
        university.addStudent(new Student("Максимов Максим"), "Юридический факультет");
        university.addStudent(new Student("Иванов Иван"), "Юридический факультет");
        university.addStudent(new Student("Беляков Беляк"), "Юридический факультет");
        university.addStudent(new Student("Пак Ен"), "Факультет журналистики");
        university.addStudent(new Student("Сан Мирбек"), "Факультет журналистики");
        university.addStudent(new Student("Цой Аня"), "Факультет журналистики");

        university.addTeacher(new Teacher("Асанова Асия"), "Факультет международных отношений");
        university.addTeacher(new Teacher("Бекова Бека"), "Факультет международных отношений");
        university.addTeacher(new Teacher("Васькова Василиса"), "Факультет международных отношений");
        university.addTeacher(new Teacher("Сатиков Сергей"), "Юридический факультет");
        university.addTeacher(new Teacher("Ким Александра"), "Юридический факультет");
        university.addTeacher(new Teacher("Вон Яна"), "Юридический факультет");
        university.addTeacher(new Teacher("Усенов Усон"), "Факультет журналистики");
        university.addTeacher(new Teacher("Батыров Батыр"), "Факультет журналистики");
        university.addTeacher(new Teacher("Аликова Алия"), "Факультет журналистики");


        System.out.println("Студенты:");
        university.getStudents().forEach((name, faculty) ->
                System.out.println("- " + name + " (" + faculty + ")"));

        System.out.println("\nПреподаватели:");
        university.getTeachers().forEach((name, faculty) ->
                System.out.println("- " + name + " (" + faculty + ")"));
    }
}