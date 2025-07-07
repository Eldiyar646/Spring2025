package abstraction.courseRate;

public interface Rateable {

    void addRating(String courseName, int rating);
    double getAverageRating(String courseName);

    default void printCourseInfo(String courseName) {
        System.out.println("Название курса: " + courseName);
    }

    static void displayInstructions(){
        System.out.println("Программа принимает название курса и оценку и выводит среднее значение.");

    }
}
