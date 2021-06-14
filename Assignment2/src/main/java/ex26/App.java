/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Shiv Patel
 */

package ex26;

//pre-processor directives
import java.util.Scanner;
import java.lang.*;
import java.io.*;



public class App {
    public static void main(String[] args){

        //Scanner declaration
        Scanner scanner = new Scanner(System.in);

        //Asks for user input for balance,APR, and payment
        System.out.print("What is your balance? ");
        double balance = scanner.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        double APR = scanner.nextDouble();
        System.out.print("What is the monthly payment you can make?");
        double payment = scanner.nextDouble();
        double months = calculateMonthsUntilPaidOff(balance,APR, payment);
        System.out.print("It will take you "+ Math.round(months) + " months to pay off this card.");


    }
    public static double calculateMonthsUntilPaidOff(double balance, double APR, double Payment){
    //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        //changes APR percentage to decimal
        double d_APR = APR/365;

        double power = Math.pow((d_APR + d_APR),30);
        double months = -(1) * (Math.log(1+((balance * (1 - power))/Payment)));
        months = months / 30;
        months = months / (Math.log(1+d_APR));
        return months;


    }
}
