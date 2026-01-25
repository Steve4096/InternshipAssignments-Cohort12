package org.example.assignments.assessment2_SteveMuturi.assignment2_basicbankaccountsystem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bank {
    private List<BankAccount> bankAccounts=new ArrayList<>();
    private Set<String> accountNumbers=new HashSet<>();

    public String generateAccountNumbers(){
        String accountNumber;
        do{
            accountNumber="ACN"+(int)(Math.random()*100000);
        }while (accountNumbers.contains(accountNumber));
        accountNumbers.add(accountNumber);
        return accountNumber;
    }

    public void createSavingsAccount(String accountHolder,double balance,double interestRate){
        String accountNumber=generateAccountNumbers();
        SavingsAccount newSavingsAccount=new SavingsAccount(accountNumber,accountHolder,balance,interestRate);
        bankAccounts.add(newSavingsAccount);
        System.out.println("Account created. Account number is: "+accountNumber);
    }

    public void createCheckingAccount(String accountHolder,double balance,double overdraftLimit){
        String accountNumber=generateAccountNumbers();
        CheckingAccount newCheckingAccount =new CheckingAccount(accountNumber,accountHolder,balance,overdraftLimit);
        bankAccounts.add(newCheckingAccount);
        System.out.println("Account created. Account number is: "+accountNumber);
    }

    public BankAccount findAccount(String accountNumber){
        for (BankAccount account:bankAccounts){
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    }

    public List<BankAccount> displayAllAccounts(){
        return bankAccounts.stream().toList();
    }

    public double calculateTotalBalance(){
        double totalBalance=0;
        for (BankAccount account:bankAccounts){
            totalBalance+=account.getBalance();
        }
        return totalBalance;
    }

    public void applyInterestToSavingsAccounts(){}
}
