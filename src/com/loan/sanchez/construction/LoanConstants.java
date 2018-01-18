/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loan.sanchez.construction;

/**
 * Interface implemented by Loan class, constants for loan term,company
 * name,maximum loan amount,prime interest rate,loan fee.
 *
 * @author ektasharma
 */
public interface LoanConstants {

    public static final int SHORT_TERM_YEARS = 1;
    public static final int MEDIUM_TERM_YEARS = 3;
    public static final int VERY_LONG_TERM_YEARS = 5;
    public static final String COMPANY_NAME = "Sanchez Construction Loan Co.";
    public static final double MAXIMUMLOANAMOUNT = 100000;
    public static final double PRIME_INTREST_RATE = 3.5;
    public static final double LOAN_FEE = 2500;
}
