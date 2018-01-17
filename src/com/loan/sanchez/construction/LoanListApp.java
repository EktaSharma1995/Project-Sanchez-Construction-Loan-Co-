/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loan.sanchez.construction;

import java.util.Scanner;

/**
 *
 * @author ektasharma
 */
public class LoanListApp {

    private static LoanDB loandb = new LoanDB();
    private static Scanner keyBoard = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void loanDBMenu() {

        int choice = 0;
        do {
            System.out.println("***Loan Database Menu***");
            System.out.println("1. Create a new object");
            System.out.println("2. Return all the loan objects stored in the array");
            System.out.println("3. Return a specific loan object from the array");
            System.out.println("4. Find a loan object based upen the customer last name and loan amount");
            System.out.println("9. Exit");
            System.out.print("Enter your choice -> ");
            choice = Integer.parseInt(keyBoard.nextLine());
            if (choice == 1) {
                System.out.println("What type of loan? Business or Personal?");
                String loanType = keyBoard.nextLine();

                if (loanType.equalsIgnoreCase("Business")) {
                    Loan bLoan = new BusinessLoan();
                    createLoanObj(bLoan);
                } else {
                    Loan pLoan = new PersonalLoan();
                    createLoanObj(pLoan);
                }
            } else if (choice == 2) {
                returnAllReords();
            } else if (choice == 3) {
                Loan loan = new BusinessLoan();
                findLoanByNumber();
            } else if (choice == 4) {
                findLoanByLastNameAndLoanAmt();
            } else if (choice != 9) {
                System.err.println("Invalid choice!!!");
            }

        } while (choice != 9);

    }

    public static void createLoanObj(Loan loanArg) {

        System.out.println("What is the loan numnber?");
        int loanNumber = Integer.parseInt(keyBoard.nextLine());

        System.out.println("What is your last name?");
        String customerLastName = keyBoard.nextLine();

        System.out.println("What is the loan amount?");
        double loanAmount = Double.parseDouble(keyBoard.nextLine());

        System.out.println("What is the loan term?");
        int loanTerm = Integer.parseInt(keyBoard.nextLine());

        boolean isLoanTermValid = loanArg.checkLoanTerm(loanTerm);
        boolean isLoanAmountAllowed = loanArg.checkLoanAmount(loanAmount);

        if (!isLoanAmountAllowed) {
            System.out.println("Sorry, you entered incorrect loan amount");
        } else {

            loanArg.setLoanNumber(loanNumber);
            loanArg.setCustomerLastName(customerLastName);
            loanArg.setLoanAmount(loanAmount);

            if (isLoanTermValid) {
                loanArg.setLoanTerm(loanTerm);
            } else {
                System.out.println("Sorry, you entered incorrect loan term, we will force 1 year short term");
                loanArg.setLoanTerm(LoanConstants.SHORT_TERM_YEARS);
            }

            loandb.createLoan(loanArg);
            System.out.println("Successfully created the Loan Object.");
            System.out.println("Details:");
            System.out.println(loanArg.toString());
        }

    }

    public static void returnAllReords() {

        System.out.println("You want to return the array");

        Loan[] loanArray = new Loan[100];
        loanArray = loandb.returnAllLoans();

        for (int i = 0; i < loanArray.length; i++) {
            Loan loan = loanArray[i];
            if (loan != null) {
                System.out.println(loan);
            }
        }
    }

    public static void findLoanByLastNameAndLoanAmt() {

        System.out.println("What is your last name?");
        String customerLastName = keyBoard.nextLine();

        System.out.println("What is the loan amount?");
        double loanAmount = Double.parseDouble(keyBoard.nextLine());

        loandb.findLoanByLastNameAndLoanAmt(customerLastName, loanAmount);

    }

    public static void findLoanByNumber() {

        System.out.println("What is the loan numnber?");
        int loanNumber = Integer.parseInt(keyBoard.nextLine());

        loandb.findLoanByNumber(loanNumber);
    }

    public static void main(String[] args) {
        loanDBMenu();
    }
}
