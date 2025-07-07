package _16_OOP._11_Bank;

import java.util.ArrayList;
import java.util.List;

public class TransactionLog {
    public List<String> logs = new ArrayList<>();

    public void addLogs(String message){
        logs.add(message);
    }

    public void printAll(){
        for (String log : logs){
            System.out.println(log);
        }
    }
}
