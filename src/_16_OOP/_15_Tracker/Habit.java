package _16_OOP._15_Tracker;

import java.util.Arrays;
import java.util.List;

public class Habit {
    private String name;
    private int targetCount;  // сколько раз эту привычку повторить.
    private int currentCount; // текущее кол-во повторения привычек.
    private boolean isCompleted; // перестали совершать вредную привычку.
    public int startCurrentCount;

    public Habit(String name, int targetCount, int currentCount) {
        this.name = name;
        this.targetCount = targetCount;
        this.currentCount = currentCount;
        this.isCompleted = false;
        this.startCurrentCount = currentCount;
    }

    public Habit() {

    }

    public void decrement() {  //true
        if (!isCompleted) {
            currentCount--;
            if (currentCount <= targetCount) {
                isCompleted = true;
            }
        }
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public int getCurrentCount() {
        return currentCount;
    }

    public int getTargetCount() {
        return targetCount;
    }

    public String getName() {
        return name;
    }

    //        public void reset() { //false
//        currentCount = 0;
//        isCompleted = false;
//    }

    public void getStatus() { // true or false
        System.out.println(isCompleted);
    }

}