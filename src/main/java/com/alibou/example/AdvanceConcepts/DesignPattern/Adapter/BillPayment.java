package com.alibou.example.AdvanceConcepts.DesignPattern.Adapter;

public class BillPayment {
    public void payBill(int amount,BankAPI bankAPI) {
        if(amount <= bankAPI.checkBalance()) {
            System.out.println("Bill Payment Successful");
        }
        else {
            System.out.println("Insufficient funds to recharge.!");
        }
    }
}
