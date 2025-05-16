package com.alibou.example.AdvanceConcepts.DesignPattern.Adapter.BankAPIs;

public class ICICIBankApi {
    public int getbalance() {
        System.out.println("Checking balance via ICICIBankApi");
        return 100;
    }
    public void moneyTranfer(int amount) {
        System.out.println("Money has Been Transferred  Via ICICIBankApi " + amount);
    }
}
