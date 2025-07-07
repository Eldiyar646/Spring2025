package _16_OOP._15_Tracker;

public class PercentHabits extends Habit{

    public Habit habit;
    public PercentHabits(String name, int targetCount, int currentCount) {
        super(name, targetCount, currentCount);
    }
    public PercentHabits(Habit habit) {
        this.habit = habit;
    }

    public int getProgressPercent() {
        return (int)(100 - ((double)getCurrentCount() * 100 / startCurrentCount));
    }

    public String printInfo() {
        return "Ваш прогресс в процентах: " + getProgressPercent();
    }

}
