package com.alibou.example.AdvanceConcepts.DesignPattern.Adapter;

public class FastTagRecharge {
    public void recharge(int amount,BankAPI bankAPI) {
        if(amount <= bankAPI.checkBalance()) {
            System.out.println("Successfully Recharged");
        }
        else {
            System.out.println("Insufficient funds to recharge.!");
        }
    }
}
