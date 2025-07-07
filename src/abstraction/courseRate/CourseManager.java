package abstraction.courseRate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseManager implements Rateable {

    private Map<String, List<Integer>> ratings = new HashMap<>();

    @Override
    public void addRating(String courseName, int rating) {
        if (!ratings.containsKey(courseName)) {
            List<Integer> ratingList = new ArrayList<>();
            ratings.put(courseName, ratingList);
        }
        List<Integer> courseRatings = ratings.get(courseName);
        courseRatings.add(rating);
    }

    public double getAverageRating(String courseName) {
        List<Integer> courseRatings = ratings.get(courseName);

        if (courseRatings == null || courseRatings.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int r : courseRatings) {
            sum += r;
        }
        return (double) sum / courseRatings.size();
    }

    public void printAllCourses() {
        System.out.println("=== =========== ===");
        for (String course : ratings.keySet()) {
            printCourseInfo(course);
            double average = getAverageRating(course);
            System.out.println("Средняя оценка: " + average);
        }
    }
}