package org.example.assignments.assessment2_SteveMuturi.quiz4_bankaccount;

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
        if(interestRate>15){
            System.out.println("Interest rate is too high");
        } else if (interestRate<4) {
            System.out.println("Interest rate is too low");
        }
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        double minimumBalance=100;
        if (super.getBalance()-amount>minimumBalance){
            System.out.println("To be able to withdraw from a savings account,you must leave behind a balance of atleast $100");
            System.out.println("Your current balance is: "+super.getBalance());
        }
        System.out.println("Withdrawal of "+amount+" was successful");
        setBalance(getBalance()-amount);
    }

    public void applyInterest(){

    }
}
