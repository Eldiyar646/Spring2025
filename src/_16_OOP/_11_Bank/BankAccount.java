package _16_OOP._11_Bank;

public class BankAccount {
    public int account_number;
    public double balance;
    private TransactionLog log;

    public BankAccount(int account_number) {
        this.account_number = account_number;
        this.balance = 0;
        this.log = new TransactionLog();
    }

    public void deposit(double amount){ // 5000

        balance += amount;
//      logs.add(message);
        log.addLogs("Deposited: " + amount); // 5000
    }

    public void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
//          logs.add(message);
            log.addLogs("Withdrew: "+ amount);
        } else {
//          logs.add(message);
            log.addLogs("Failed withdrawal: Insufficient funds");
        }
    }

    public void checkBalance(){
        System.out.println("Check balance: "+ balance);
    }

    public void printLog(){
        System.out.println("Account # " + account_number + "\nTransaction logs: ");
        log.printAll();
    }
}