package _16_OOP._06_Accaunt;

public class Account {
    public String name;
    public String login;
    public String password;

    public Account(String name, String login, String password) {
        this.name = name;
        if (login.length() >= 6) {
            this.login = login;
            if (password.length() >= 8) {
                this.password = password;
            } else {
                System.out.println("Пароль должен содержать 8 символов");
            }
        } else {
            System.out.println("Логин должен содержать 6 символов");
        }
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Логин: " + login + ", Пароль: " + password;
    }
}
