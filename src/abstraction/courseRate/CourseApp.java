package abstraction.courseRate;

import java.util.Scanner;

public class CourseApp {
    public static void main(String[] args) {

        Rateable.displayInstructions();

        Scanner scn = new Scanner(System.in);

        CourseManager manager = new CourseManager();

        manager.addRating("Java", 5);
        manager.addRating("Java", 4);
        manager.addRating("Python", 5);
        manager.addRating("Python", 5);

        manager.printAllCourses();

        while (true) {
            System.out.println();
            System.out.print("Введите название курса или 'exit' для выхода): ");
            String courseName = scn.nextLine();

            if (courseName.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Введите оценку (1-5): ");
            String ratingInput = scn.nextLine();


            boolean isNumber = true;
            for (int i = 0; i < ratingInput.length(); i++) {
                if (!Character.isDigit(ratingInput.charAt(i))) {
                    isNumber = false;
                    break;
                }
            }
            if (!isNumber) {
                System.out.println("Нужно ввести число");
                continue;
            }

            int rating = Integer.parseInt(ratingInput);

            if (rating < 1 || rating > 5) {
                System.out.println("Оценка должна быть в пределах от 1 до 5");
                continue;
            }
            manager.addRating(courseName, rating);
            manager.printAllCourses();
        }
    }
}
