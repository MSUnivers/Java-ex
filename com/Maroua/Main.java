package com.Maroua;

import java.awt.font.NumericShaper;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // My approach
      /*  long principal = 100000;
        float annualInterestRate = 3.92F;
        float monthlyInterestRate = (annualInterestRate / 100) / 12;
        int period = 30;
        int numberOfPayment = 30 * 12;
        NumberFormat mortGage = NumberFormat.getCurrencyInstance();
        System.out.println(mortGage.format(principal * ((monthlyInterestRate * (Math.pow((1 + monthlyInterestRate), numberOfPayment))) / (Math.pow((1 + monthlyInterestRate), numberOfPayment) - 1))));
*/
        final byte year = 12;
        final byte percent = 100;
        System.out.print("Principal loan:");
        Scanner scanner=new Scanner(System.in);
        int principal=scanner.nextInt();
        System.out.print("annual interest Rate:");
        float annualInterest= scanner.nextFloat();
        float monthlyInterestRate = (annualInterest / percent) /year;
        System.out.print("period of loan (number of years):");
        byte period=scanner.nextByte();
        int numberOfPayment=period*year;
        double mortGage=principal * ((monthlyInterestRate * (Math.pow((1 + monthlyInterestRate), numberOfPayment))) / (Math.pow((1 + monthlyInterestRate), numberOfPayment) - 1));

        System.out.println(mortGage);
        //String formattedMortGage=NumberFormat.getCurrencyInstance().format(mortGage);
        NumberFormat formatted= NumberFormat.getCurrencyInstance();
        String formattedGage=formatted.format(mortGage);
        System.out.println(formattedGage);


    }
}
