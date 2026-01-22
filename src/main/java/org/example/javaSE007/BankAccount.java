package org.example.javaSE007;

public class BankAccount {
    public String accountNumber;
    public String accountHolder;
    public double balance;

    public BankAccount(){
        this.accountNumber=null;
        this.accountHolder=null;
        this.balance=0;
    }

    public BankAccount(String accountNumber,String accountHolder){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
    }

    public BankAccount(String accountNumber,String accountHolder,double balance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }

    public void deposit(double amount){
        if(amount<=0){
                System.out.println("You can't deposit 0 or less.");
    }else {
            System.out.println("You have successfully deposited "+amount);
            balance+=amount;
        }
    }

    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Not allowed. Your balance is "+balance);
            System.out.println("Please enter an amount equal to or less than your balance.");
        } else if (amount<=0) {
            System.out.println("You can't withdraw 0 shillings or less");
        } else {
            System.out.println("You have successfully withdrawn "+amount);
            balance-=amount;
        }
    }

    public void displayBalance(){
        System.out.println("Balance is:"+balance);
    }
}
