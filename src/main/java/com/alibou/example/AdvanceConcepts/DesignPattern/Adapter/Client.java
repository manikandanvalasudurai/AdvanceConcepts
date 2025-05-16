package com.alibou.example.AdvanceConcepts.DesignPattern.Adapter;

import com.alibou.example.AdvanceConcepts.DesignPattern.Adapter.BankAPIAdapters.ICICIBankAPIAdapter;
import com.alibou.example.AdvanceConcepts.DesignPattern.Adapter.BankAPIAdapters.YesBankAPIAdapter;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a Bank you want to Use [Yes or ICICI ]");
        String bankName = scanner.nextLine();
        BankAPI bankAPI = BankAPIFactory.getBankAPI(bankName);
        Phonepe phonepee = new Phonepe(bankAPI);
        phonepee.rechargeFastTag(50);
    }
}
