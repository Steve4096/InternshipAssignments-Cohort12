package org.example.assignments.assessment2_SteveMuturi.assignment2_basicbankaccountsystem;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(String accountNumber,String accountHolder,double balance,double interestRate){
        super(accountNumber, accountHolder, balance);
        setInterestRate(interestRate);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if (interestRate < 4 || interestRate > 15) {
            throw new InvalidAmountException("Interest rate must be between 4% and 15%");
        }
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if(amount<=0){
            throw new InvalidAmountException("Invalid amount.");
        }
        double minimumBalance=100;
        if(getBalance()-amount<minimumBalance)
        throw new InsufficientFundsException("To be able to withdraw from a savings account,you must leave behind a balance of atleast $100");
            System.out.println("Your current balance is: "+super.getBalance());
        System.out.println("Withdrawal of "+amount+" was successful");
        setBalance(getBalance()-amount);
    }

    public void applyInterest(double interestRate){
        double interest=getBalance()*interestRate/100;
        setBalance(getBalance()+interest);
    }
}
