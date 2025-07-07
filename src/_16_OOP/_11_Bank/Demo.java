package _16_OOP._11_Bank;

public class Demo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(575798);
        bankAccount.checkBalance();
        bankAccount.deposit(5000);
        bankAccount.withdraw(500);
        bankAccount.withdraw(200);
        bankAccount.printLog();
        bankAccount.checkBalance();

        System.out.println("------------------------");

        BankAccount bankAccount2 = new BankAccount(5758);
        bankAccount2.checkBalance();
        bankAccount2.deposit(1000);
        bankAccount2.withdraw(500);
        bankAccount2.withdraw(200);
        bankAccount2.printLog();
        bankAccount2.checkBalance();
    }

}
