package com.alibou.example.AdvanceConcepts.DesignPattern.Adapter.BankAPIAdapters;

import com.alibou.example.AdvanceConcepts.DesignPattern.Adapter.BankAPI;
import com.alibou.example.AdvanceConcepts.DesignPattern.Adapter.BankAPIs.ICICIBankApi;

public class ICICIBankAPIAdapter implements BankAPI {
    private ICICIBankApi iciciBankApi = new ICICIBankApi();

    @Override
    public int checkBalance() {
        return iciciBankApi.getbalance();
    }

    @Override
    public void tranferMoney(int amount) {
           iciciBankApi.moneyTranfer(amount);
    }
}
