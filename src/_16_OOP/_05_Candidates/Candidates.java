package _16_OOP._05_Candidates;

public class Candidates {

    public String ageOfCandidates(int age) {
        return (age >= 21 && age <= 35) ? PURPLE + "Принято!" + RESET : RED + "Следующий вопрос." + RESET;
    }

    public String heightOfCandidates(double height) {
        return (height >= 160 && height <= 190) ? PURPLE + "Принято!" + RESET : RED + "Следующий вопрос." + RESET;
    }

    public String tattoo (String tattoo) {
        boolean isHasTattoo = tattoo.equalsIgnoreCase("да");
        return isHasTattoo ? RED + "Следующий вопрос." + RESET : PURPLE + "Принято!" + RESET;
    }

    public String education(String education) {
        boolean isHasLevel = education.equalsIgnoreCase("да");
        return isHasLevel ? PURPLE + "Принято!" + RESET: RED + "Следующий вопрос." + RESET;
    }

    public String languageSkills(int english) {
        return (english == 2 || english == 3) ? PURPLE + "Принято!" + RESET: RED + "Спасибо за собеседование" + RESET;
    }

    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";
    public static final String RESET  = "\u001B[0m";
    public static final String PURPLE = "\u001B[35m";

}