/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loan.sanchez.construction;

import java.util.Objects;

/**
 * Abstract class which implements LoanConstants interface.
 *
 * @author ektasharma
 */
public abstract class Loan implements LoanConstants {

    public int loanNumber;
    public String customerLastName;
    public double loanAmount;
    public double interestRate;
    public int loanTerm;

    public Loan() {
    }

    /**
     *
     * @param loanNumber
     * @param customerLastName
     * @param loanAmount
     * @param loanTerm
     */
    public Loan(int loanNumber, String customerLastName, double loanAmount, int loanTerm) {     //Parameterized constructor of class Loan
        this.customerLastName = customerLastName;
        this.loanAmount = loanAmount;
        this.loanNumber = loanNumber;
        this.loanTerm = loanTerm;
    }

    /**
     *
     * @Accessor method
     */
    public int getLoanNumber() {
        return loanNumber;
    }

    /**
     * Mutator method
     *
     * @param loanNumber
     */
    public void setLoanNumber(int loanNumber) {
        this.loanNumber = loanNumber;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    /**
     *
     * @return loan balance
     */
    public double getLoanBalance() {
        double loanBalance = loanAmount + LOAN_FEE;
        System.out.println(loanBalance);
        return loanBalance;
    }

    /**
     *
     * @param loanTerm
     * @return status of loan term as true/ false
     */
    public boolean checkLoanTerm(int loanTerm) {
        if (loanTerm == LoanConstants.MEDIUM_TERM_YEARS
                || loanTerm == LoanConstants.VERY_LONG_TERM_YEARS
                || loanTerm == LoanConstants.SHORT_TERM_YEARS) {
            return true;
        } else {
            return false;

        }
    }

    /**
     *
     * @param loanAmount
     * @return status of loan amount as true/false
     */
    public boolean checkLoanAmount(double loanAmount) {
        if (loanAmount <= LoanConstants.MAXIMUMLOANAMOUNT) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Loan{" + "loanNumber=" + loanNumber + ", customerLastName=" + customerLastName + ", loanAmount=" + loanAmount + ", interestRate=" + interestRate + ", loanTerm=" + loanTerm + '}';
    }

    @Override
    /**
     * equals method comparing 2 loan objects on the basis of their last name
     * and loan amount.
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Loan other = (Loan) obj;
        if (Double.doubleToLongBits(this.loanAmount) != Double.doubleToLongBits(other.loanAmount)) {
            return false;
        }
        if (!Objects.equals(this.customerLastName, other.customerLastName)) {
            return false;
        }
        return true;
    }

}
