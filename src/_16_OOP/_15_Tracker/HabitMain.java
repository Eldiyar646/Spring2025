package _16_OOP._15_Tracker;

import java.util.ArrayList;
import java.util.List;

public class HabitMain {
    public static void main(String[] args) {

        Habit smoking = new Habit("Курение", 1, 10);
        Habit jogging = new Habit("Ходьба", 1, 5);
        Habit alcohol = new Habit("Алкоголь", 0, 4);

        List<Habit> habits = new ArrayList<>(List.of(smoking, jogging, alcohol));




        PercentHabits percentHabits = new PercentHabits(smoking);
//        percentHabits.decrement();
//        System.out.println(percentHabits.printInfo());
       System.out.println(smoking.getCurrentCount());
    }
}