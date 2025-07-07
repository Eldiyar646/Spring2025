package _16_OOP._06_Accaunt;

import java.util.ArrayList;

public class AccountMain {
    public static void main(String[] args) {


        Account alex = new Account("Alex Winner", "alex007", "winwin");
        Account jim = new Account("Jim Kerry", "jim_K_comedy", "j_comedy1");
        Account clark = new Account("Clark jonathan", "jonathan_c", "qwerty12345");
        Account tim = new Account("Tim Stalker", "stalker_bboy", "tim_kook");

        ArrayList<Account> allAccounts = new ArrayList<>();
        allAccounts.add(alex);
        allAccounts.add(jim);
        allAccounts.add(clark);
        allAccounts.add(tim);
        System.out.println(allAccounts);

        ArrayList<Account> validAccount = new ArrayList<>();
        for (int i = 0; i < allAccounts.size(); i++) {
            //                       true        &&                          false
            //                alex.login != null                  alex.password != null
            //                       true        &&                          true
            //                 jim.login != null                   jim.password != null
            if (allAccounts.get(i).login != null && allAccounts.get(i).password != null) {
                //                           Jim
                validAccount.add(allAccounts.get(i));
            }
        }
        System.out.println(validAccount);
        System.out.println("---------------------");

        Media printList = new Media();

        printList.addEntry("Исторический музей", "Этот музей в городе Бишкек.");
        printList.addEntry("Магистраль", "Местный автобан.");
        printList.addEntry("Лексус 600", "Вот это крутая тачка.");

        System.out.println("---------------------");
        printList.printAll();

        System.out.println("---------------------");

        Media lx = new Media("Лексус 570", "");
        printList.addEntry(lx);
        printList.printAll();




    }

    // [Issyk-Kul Marathon 2025, quotes, Dreams come true in Paris]
    // [1 - photo: Issyk-Kul Marathon 2025,
    // [2 - reels: quotes,
    // [3 - photo: Dreams come true in Paris]


}