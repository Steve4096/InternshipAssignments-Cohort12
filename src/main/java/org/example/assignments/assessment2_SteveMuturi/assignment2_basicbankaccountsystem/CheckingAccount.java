package org.example.assignments.assessment2_SteveMuturi.assignment2_basicbankaccountsystem;

public class CheckingAccount extends BankAccount{
    private double overdraftLimit;

    public CheckingAccount(String accountNumber,String accountHolder,double balance,double overdraftLimit){
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit=overdraftLimit;
    }

//    @Override
//    public void withdraw(double amount) {
//        double maximumAmountWithdrawable=super.getBalance()+overdrafLimit;
//        if((super.getBalance()-amount)>maximumAmountWithdrawable) throw new InsufficientFundsException("You have exceeded your withdrawal limit/amount.");
//        else {
//            double balance=getBalance()-amount;
//            setBalance(balance);
//        }
//    }


    @Override
    public void withdraw(double amount) {
        if(amount<=0)throw new InvalidAmountException("Invalid amount.");

        if(amount>getBalance()+overdraftLimit){
            throw new InsufficientFundsException("Overdraft limit exceeded.");
        }

        setBalance(getBalance()-amount);
    }
}
