/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loan.sanchez.construction;

import java.util.Objects;

/**
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

    public Loan(int loanNumber, String customerLastName, double loanAmount, int loanTerm) {
        this.customerLastName = customerLastName;
        this.loanAmount = loanAmount;
        this.loanNumber = loanNumber;
        this.loanTerm = loanTerm;
    }

    public int getLoanNumber() {
        return loanNumber;
    }

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
    
    
    public double getLoanBalance() {
        return loanAmount + LOAN_FEE;
    }
    
    public void checkAllowedLoanAmount() {
        if(loanAmount == LoanConstants.MAXIMUMLOANAMOUNT) {
              System.out.print("Allowed");
          } else {
              System.out.print("Not Allowed");
          }
    }
    
    public void checkLoanTerm() {
        if(loanTerm == MEDIUM_TERM_YEARS){
            System.out.println("Loan term must be short-term");
        } else if(loanTerm == VERY_LONG_TERM_YEARS) {
            System.out.println("Loan term must be short-term");
        } else {
            System.out.println("Loan term is short-term");
        }
    }

    @Override
    public String toString() {
        return "Loan{" + "loanNumber=" + loanNumber + ", customerLastName=" + customerLastName + ", loanAmount=" + loanAmount + ", interestRate=" + interestRate + ", loanTerm=" + loanTerm + '}';
    }
    

    @Override
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