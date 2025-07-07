package _16_OOP._14_Passport;

import java.util.ArrayList;
import java.util.List;

public class Passport {

    public String fullName;
    public String id;
    public String nationality;


    public Passport(String fullName, String id, String nationality) {
        this.fullName = fullName;
        this.id = id;
        this.nationality = nationality;
    }

    public String getFullName() {
        return fullName;
    }

    public String getId() {
        return id;
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return "Passport: " + "FullName: " + fullName + ", ID: " + id + ", Nationality: " + nationality;
    }

    public static Passport search(List<Passport> passportList, String id) {
        for(Passport p : passportList) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }
}
