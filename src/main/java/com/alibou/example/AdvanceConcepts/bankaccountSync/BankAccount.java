package com.alibou.example.AdvanceConcepts.bankaccountSync;

public class BankAccount {
    public Long balance;

    public BankAccount() {
       balance = 0L;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public void deposit(Long amount) {
        if(amount > 0){
            balance += amount;
        }
    }
    public void withdraw(Long amount) {
        if((balance >= amount) && (amount > 0)){
            balance -= amount;
        }
    }

}
