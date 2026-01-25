package org.example.assignments.assessment2_SteveMuturi.assignment2_basicbankaccountsystem;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Bank bank=new Bank();
        Scanner scanner=new Scanner(System.in);
        boolean running=true;
        while (running){
            printMenu();
            if (!scanner.hasNextInt()){
                System.out.println("Invalid input. Please select a number from the menu below");
                scanner.next();
                continue;
            }
            int choice=scanner.nextInt();
            scanner.nextLine();
            if(choice<=0 || choice>8){
                System.out.println("Invalid option. Please select one from the menu below");
            }
            switch (choice){
                case 1 -> {
                    try {
                        System.out.println("Enter account holder name");
                        String name=scanner.nextLine();

                        System.out.println("Enter initial balance");
                        double balance= scanner.nextDouble();
                        scanner.nextLine();

                        System.out.println("Enter interest rate");
                        double interestRate= scanner.nextDouble();
                        scanner.nextLine();

                        bank.createSavingsAccount(name,balance,interestRate);
                        System.out.println("Account created successfully.");
                    }catch (RuntimeException e){
                        System.out.println("Error:"+e.getMessage());
                        scanner.nextLine();
                    }
                }
                case 2 ->{
                    try {
                        System.out.println("Enter account holder name");
                        String name=scanner.nextLine();

                        System.out.println("Enter initial balance");
                        double balance= scanner.nextDouble();
                        scanner.nextLine();

                        System.out.println("Enter overdraft limit");
                        double overdraftLimit= scanner.nextDouble();
                        scanner.nextLine();

                        bank.createCheckingAccount(name,balance,overdraftLimit);
                        System.out.println("Checking account created successfully");
                    } catch (RuntimeException e) {
                        System.out.println("Error:"+e.getMessage());
                        scanner.nextLine();
                    }

                }
                case 3->{
                        System.out.println("Enter account number");
                        String accountNumber= scanner.nextLine();
                        BankAccount account=bank.findAccount(accountNumber);
                        if (account==null){
                            System.out.println("No such account exists");
                        }
                        try {
                            System.out.print("Deposit amount: ");
                            double amount = scanner.nextDouble();
                            scanner.nextLine();

                            account.deposit(amount);
                            System.out.println("Deposit successful.");
                    } catch (RuntimeException e) {
                            System.out.println("Error:"+e.getMessage());
                            scanner.nextLine();
                        }
                }
                case 4->{
                    System.out.print("Enter account number: ");
                    String accNo = scanner.nextLine();

                    BankAccount account = bank.findAccount(accNo);
                    if (account == null) {
                        System.out.println("Account not found.");
                        break;
                    }

                    try {
                        System.out.print("Withdraw amount: ");
                        double amount = scanner.nextDouble();
                        scanner.nextLine();

                        account.withdraw(amount);
                        System.out.println("Withdrawal successful.");
                    } catch (RuntimeException e) {
                        System.out.println("Error: " + e.getMessage());
                        scanner.nextLine();
                    }
                }
                case 5 ->{
                    System.out.print("Enter account number: ");
                    String accNo = scanner.nextLine();

                    BankAccount account = bank.findAccount(accNo);
                    if (account == null) {
                        System.out.println("Account not found.");
                    } else {
                        System.out.println("Current balance: " + account.getBalance());
                    }
                }
                //case 6 ->
                case 7->{
                    for (BankAccount account : bank.displayAllAccounts()) {
                        System.out.println(account);
                    }
                }
                case 8->{
                    System.out.println("Exiting the system.");
                    running=false;
                }
                default -> {
                    System.out.println("Invalid option");
                }
            }
        }

    }

    public static void printMenu(){
        System.out.println("===Bank Account System===");
        System.out.println("1.Create Savings account");
        System.out.println("2.Create Checking account");
        System.out.println("3.Deposit");
        System.out.println("4.Withdraw");
        System.out.println("5.Check balance");
        System.out.println("6.Apply interest(Savings account)");
        System.out.println("7.Display All Accounts");
        System.out.println("8.Exit");
    }

    //Test cases
    /*1.Account creation
    2.Deposit operations
    3.Withdrawal operations
    4.Polymorphic behaviour
    5.
     */
}
