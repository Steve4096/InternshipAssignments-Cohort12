package org.example.exercises.javase012.exercise1;

public class BankAccount {
    private static int totalAccounts;
    private static String bankName;
    private static double interestRate;
    private String accountNumber;
    private String accountHolder;
    private double balance;

    private static int getTotalAccounts(){
        return totalAccounts;
    }

    private static void setInterestRate(double interestRate){
        if(interestRate<0){
            throw new IllegalArgumentException("Interest rate cannot be less than 0");
        }
        BankAccount.interestRate=interestRate;
    }

    public void deposit(){}

    public void withdraw(){}

    public void applyInterest(){}
}
