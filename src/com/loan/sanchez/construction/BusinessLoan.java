/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loan.sanchez.construction;

/**
 * Encapsulating Business Type Loan
 *
 * @author ektasharma
 */
public class BusinessLoan extends Loan {

    /**
     * Default constructor. Also sets interest rate
     */
    public BusinessLoan() {
        super.setInterestRate(LoanConstants.PRIME_INTREST_RATE + 1);
    }

    /**
     * Constructor accepting loan details
     *
     * @param loanNumber
     * @param customerLastName
     * @param loanAmount
     * @param loanTerm
     */
    public BusinessLoan(int loanNumber, String customerLastName, double loanAmount, int loanTerm) {
        super(loanNumber, customerLastName, loanAmount, loanTerm);
        super.setInterestRate(LoanConstants.PRIME_INTREST_RATE + 1);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
