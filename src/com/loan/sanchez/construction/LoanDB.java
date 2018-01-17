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
public class LoanDB implements ILoanDB {

    private Loan[] loanArray;
    private int count;
    private final int capacity;

    /**
     *
     * @param
     */
    public LoanDB() {
        this(10);
    }

    public LoanDB(int capacity) {
        this.capacity = capacity;
        this.count = 0;
        loanArray = new Loan[capacity];
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getCount() {
        return this.count;
    }

    @Override
    public void createLoan(Loan loan) {
        loanArray[count++] = loan;
    }

    /**
     * Return all loan database
     *
     * @return
     */
    @Override
    public Loan[] returnAllLoans() {
        return loanArray;
    }

    @Override
    public Loan findLoanByNumber(int loanNumber) {
        Loan loanFound = null;
        for (int index = 0; index < count; index++) {
            Loan loan = loanArray[index];

            if (loanNumber == loan.getLoanNumber()) {
                loanFound = loan;
                System.out.println(loanFound);
                break;
            }
        }
        return loanFound;
    }

    @Override
    public Loan findLoanByLastNameAndLoanAmt(String customerLastName, double loanAmount) {
        Loan loanFound = null;
        for (int index = 0; index < count; index++) {
            Loan loanTmp = loanArray[index];

            if ((loanTmp.getCustomerLastName().equalsIgnoreCase(customerLastName)) && (loanTmp.getLoanAmount() == (loanAmount))) {
                loanFound = loanTmp;
                System.out.println(loanFound);
                break;
            }
        }
        return loanFound;
    }

}
