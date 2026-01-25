package org.example.assignments.assessment2_SteveMuturi.assignment2_basicbankaccountsystem;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber,String accountHolder,double balance){
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        if(accountNumber==null || accountNumber.trim().isEmpty()) throw new InvalidFormatException("Account number can't be null or empty");
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        if(accountHolder==null || accountHolder.trim().isEmpty()) throw new InvalidFormatException("Account holder must be explicitly set.");
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance) {
        //if(balance<0)throw new RuntimeException("Balance can't be negative.");
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount<=0)throw new InvalidAmountException("You can't deposit 0 or less.");
        else {
            System.out.println("You have successfully deposited "+amount);
            balance+=amount;
        }
    }

    public void withdraw(double amount){
        if(amount>balance)throw new InsufficientFundsException("Your balance is "+balance+".Please enter an amount equal to or less than your balance.");
        else if (amount<=0) throw new InvalidAmountException("You can't withdraw 0 shillings or less");
        else {
            System.out.println("You have successfully withdrawn "+amount);
            balance-=amount;
        }
    }

    public void displayBalance(){
        System.out.println("Balance is:"+balance);
    }

    @Override
    public String toString() {
        return "BankAccount{accountNumber:'"+accountNumber+"',accountHolder:'"+accountHolder+"',balance:'"+balance+"'}";
    }
}
