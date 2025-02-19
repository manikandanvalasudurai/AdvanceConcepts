package com.alibou.example.AdvanceConcepts.bankaccountSync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount = new BankAccount();
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        Runnable depositTask = () -> {
            for (Long i = 0L; i < 100; i++) {
                bankAccount.deposit(i);
            }
        };

        Runnable withdrawTask = () -> {
            for (Long i = 0L; i < 100; i++) {
                bankAccount.withdraw(i);
            }
        };
        executorService.submit(depositTask);
        executorService.submit(withdrawTask);
        executorService.shutdown();// initiates shutdown of the tasks didn't accept new tasks waits for prev tasks gets over4
        executorService.awaitTermination(2, TimeUnit.MINUTES);
        System.out.println("Final balance: " + bankAccount.getBalance());
    }
}
