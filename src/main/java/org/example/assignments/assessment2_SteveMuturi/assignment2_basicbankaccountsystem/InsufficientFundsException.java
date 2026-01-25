package org.example.assignments.assessment2_SteveMuturi.assignment2_basicbankaccountsystem;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
