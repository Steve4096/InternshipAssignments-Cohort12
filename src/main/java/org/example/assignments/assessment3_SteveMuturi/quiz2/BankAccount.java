package org.example.assignments.assessment3_SteveMuturi.quiz2;

import org.example.assignments.assessment2_SteveMuturi.assignment2_basicbankaccountsystem.InvalidFormatException;

import java.util.HashSet;
import java.util.Set;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber,String accountHolder,double balance){
        setAccountNumber(accountNumber);
        setAccountHolder(accountHolder);
        setBalance(balance);
    }

    public void setAccountNumber(String accountNumber){
        if(accountNumber==null || accountNumber.isEmpty()){
            throw new InvalidFormatException("Invalid account number");
        }
        this.accountNumber=accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance) {
        if (balance<0){
            throw new InvalidTransactionException("Initial balance can't be negative");
        }
        this.balance=balance;
    }


    public void deposit(double amount){
        if(amount<=0){
            throw new InvalidTransactionException("You can't deposit 0 or less.");
        }else {
            System.out.println("You have successfully deposited "+amount);
            balance+=amount;
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount>balance){
            throw new InsufficientFundsException("Not allowed. Your balance is "+balance +" .Please enter an amount equal to or less than your balance.");
        } else if (amount<=0) {
            throw new InvalidTransactionException("You cant withdraw 0 shiilings or less");
        } else {
            System.out.println("You have successfully withdrawn "+amount);
            balance-=amount;
        }
    }

    public void transfer(BankAccount accountTo,double amount) throws InsufficientFundsException,AccountNotFoundException{
        if (accountTo==null){
            throw new AccountNotFoundException("Account not found");
        }
        if(amount<=0){
            throw new InsufficientFundsException("Please enter an amount greater than 0");
        }
        withdraw(amount);
        accountTo.deposit(amount);
    }

    public double getBalance(){
        return balance;
    }
}
