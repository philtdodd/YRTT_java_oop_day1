package com.techreturners.encapsulation.bankaccount.model;

public class SecureBankAccount {

    private final String ACCOUNTNUMBER;
    private final int REWARDAMOUNT = 50;
    private int accountBalance;

    public SecureBankAccount(String accountNumber) {
        this.ACCOUNTNUMBER = accountNumber;
        this.accountBalance = 0;
    }

    public void depositAmount(int amount) {
        accountBalance += amount;
        addReward();
    }

    public void displayAccountBalance() {
        System.out.println("Your account balance is " + accountBalance);
    }

    public void debitAmount (int amount) {
        accountBalance -= amount;
    }

    private void addReward() {
        accountBalance += REWARDAMOUNT;
    }
}
