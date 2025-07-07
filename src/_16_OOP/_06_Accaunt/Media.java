package _16_OOP._06_Accaunt;

import java.util.LinkedHashMap;
import java.util.Map;

public class Media {

    private String photo;
    private String description;
    private Map<String, Media> instagram = new LinkedHashMap<>();

    public Media() {
    }

    public Media(String photo, String description) {
        this.photo = photo;
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void addEntry(String photo, String description) {
        this.instagram.put(photo, new Media(photo, description));
    }

    public void addEntry(Media entry) {
        this.instagram.put(entry.getPhoto(), entry);
    }

    public void print() {
        System.out.println("Фото: " + photo);
        System.out.println("Описание: " + description);
    }

    public void printAll() {
        for (Media entry : instagram.values()) {
            entry.print();
        }
    }

    @Override
    public String toString() {
        return "Фото: " + photo + "\nОписание: " + description;
    }
}