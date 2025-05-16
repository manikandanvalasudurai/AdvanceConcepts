package com.alibou.example.AdvanceConcepts.DesignPattern.Adapter;

import com.alibou.example.AdvanceConcepts.DesignPattern.Adapter.BankAPIAdapters.ICICIBankAPIAdapter;

public class Phonepe {
    private  BankAPI bankAPI;
    private  FastTagRecharge fastTagRecharge;
    private BillPayment billPayment;

    public Phonepe(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
        fastTagRecharge = new FastTagRecharge();
        billPayment = new BillPayment();
    }

    public void rechargeFastTag(int amount) {
        fastTagRecharge.recharge(50,bankAPI);
    }

    public void payBill(int amount) {
        billPayment.payBill(amount,bankAPI);
    }


}
