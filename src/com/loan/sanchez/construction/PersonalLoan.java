/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loan.sanchez.construction;

/**
 *
 * @author ektasharma
 */
public class PersonalLoan extends Loan{
    
    
    
    public PersonalLoan() {
       super.setInterestRate(LoanConstants.PRIME_INTREST_RATE + 2);
    }
    
    public PersonalLoan(int loanNumber, String customerLastName, double loanAmount, int loanTerm) {
        super(loanNumber,customerLastName,loanAmount,loanTerm);
        super.setInterestRate(LoanConstants.PRIME_INTREST_RATE + 2);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
