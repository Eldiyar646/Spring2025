package _16_OOP._15_Tracker;

import java.util.ArrayList;
import java.util.List;

public class HabitTracker {
    List<Habit> habits;
    List<Habit> completedHabits;

    public HabitTracker() {
        this.habits = new ArrayList<>();
    }

    public void addHabit(Habit habit) {
        habits.add(habit);
    }

    public void showAllHabits() {
        for (Habit habit : habits) {
            System.out.println("Habits in progress: " + habit);
        }
        for (Habit habit : completedHabits) {
            System.out.println("Completed habits: " + habit);
        }
    }

    public void addCompletedHabit(Habit habit) {
        if (habit.isCompleted()) {
            completedHabits.add(habit);
        }
    }

    public void showCompletedHabits() {
        for (Habit habit : completedHabits) {
            System.out.println(habit);
        }
    }
}
