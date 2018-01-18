/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loan.sanchez.construction;

import java.util.Scanner;

/**
 * Class to run
 * @author ektasharma
 */
public class LoanApp {
    
    public static void main(String[] args) {
        LoanObjectManager loanList = new LoanObjectManager();
        loanList.loanDBMenu();      
    }
}
