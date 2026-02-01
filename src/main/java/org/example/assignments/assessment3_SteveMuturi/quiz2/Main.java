package org.example.assignments.assessment3_SteveMuturi.quiz2;

public class Main {
    public static void main(String[] args) {
        try {
            BankAccount bankAccount=new BankAccount("a001","Steve",4000);
            bankAccount.withdraw(1000);
            BankAccount bankAccount1=new BankAccount("a002","Muturi",567);
            bankAccount.transfer(bankAccount1,567);
            bankAccount.withdraw(10000);
            System.out.println(bankAccount.getBalance());
            System.out.println(bankAccount1.getBalance());
        }catch (InsufficientFundsException | AccountNotFoundException exception){
            System.out.println("Error:"+exception.getMessage());
        }
    }
}
