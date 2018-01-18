/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loan.sanchez.construction;

/**
 * LoanDB class, implements ILoanDB
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
    /**
     * Saving loan object
     */
    public void createLoan(Loan loan) {
        loanArray[count++] = loan;
    }

    /**
     * Return all loan objects stored in array.
     *
     * @return
     */
    @Override
    public Loan[] returnAllLoans() {
        return loanArray;
    }

    @Override
    /**
     * Find loan object on the basis of loan number and return the status.
     */
    public Loan findLoanByNumber(int loanNumber) {
        Loan loanFound = null;
        for (int index = 0; index < count; index++) {
            Loan loan = loanArray[index];

            if (loanNumber == loan.getLoanNumber()) {
                loanFound = loan;
                System.out.println(loanFound);
                break;
            } else {
                System.out.println("No Object Found with this loan number");
            }
        }

        return loanFound;
    }

    @Override
    /**
     * Find loan object on the basis of last name and loan amount and return the
     * status.
     */
    public Loan findLoanByLastNameAndLoanAmt(String customerLastName, double loanAmount) {
        Loan loanFound = null;
        for (int index = 0; index < count; index++) {
            Loan loanTmp = loanArray[index];

            if ((loanTmp.getCustomerLastName().equalsIgnoreCase(customerLastName)) && (loanTmp.getLoanAmount() == (loanAmount))) {
                loanFound = loanTmp;
                System.out.println(loanFound);
                break;
            } else {
                System.out.println("No Object Found");

            }
        }
        return loanFound;

    }

}
