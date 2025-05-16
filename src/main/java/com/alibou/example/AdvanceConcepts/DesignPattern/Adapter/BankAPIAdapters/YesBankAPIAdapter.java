package com.alibou.example.AdvanceConcepts.DesignPattern.Adapter.BankAPIAdapters;

import com.alibou.example.AdvanceConcepts.DesignPattern.Adapter.BankAPI;
import com.alibou.example.AdvanceConcepts.DesignPattern.Adapter.BankAPIs.YesBankAPI;

public class YesBankAPIAdapter implements BankAPI {
    private YesBankAPI yesBankAPI = new YesBankAPI();


    @Override
    public int checkBalance() {
        return yesBankAPI.balanceCheck();
    }

    @Override
    public void tranferMoney(int amount) {
        yesBankAPI.transferMoney(amount);
    }
}
