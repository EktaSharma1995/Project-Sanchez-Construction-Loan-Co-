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
public interface ILoanDB {
    public void createLoan(Loan loan);
    public Loan[] returnAllLoans();
    public Loan findLoanByNumber (int loanNumber);
    public Loan findLoanByLastNameAndLoanAmt(String customerLastName, double loanAmount);
}
