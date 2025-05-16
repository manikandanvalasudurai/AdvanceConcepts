package com.alibou.example.AdvanceConcepts.DesignPattern.Adapter;

import com.alibou.example.AdvanceConcepts.DesignPattern.Adapter.BankAPIAdapters.ICICIBankAPIAdapter;
import com.alibou.example.AdvanceConcepts.DesignPattern.Adapter.BankAPIAdapters.YesBankAPIAdapter;

public class BankAPIFactory {
    public static BankAPI getBankAPI(String bankName) {
        BankAPI bankAPI = null;
        if(bankName.equals("Yes")) {
            bankAPI = new YesBankAPIAdapter();
        }
        else if(bankName.equals("ICICI")) {
            bankAPI = new ICICIBankAPIAdapter();
        }
        return bankAPI;
    }
}
