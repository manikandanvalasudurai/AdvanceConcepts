package com.alibou.example.AdvanceConcepts.DesignPattern.Adapter.BankAPIs;

public class YesBankAPI {
    public int balanceCheck() {
        System.out.println("Checking balance via YesBankAPI");
        return 100;
    }

    public void transferMoney(int amount) {
        System.out.println("Money has Been Transferred  Via YesBankAPI " + amount);
     }
}