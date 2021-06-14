/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Shiv Patel
 */


package ex29;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //Scanner declaration
        Scanner scanner = new Scanner(System.in);

        //variable intilization
        double r;

        //loop to ask for return and check for numerical input
        while(true)
        {
            try
            {
                System.out.print("What is the rate of return? ");
                String str = scanner.next();
                r = Double.parseDouble(str);
                if(r == 0)
                    throw new Exception();
                break;
            }
            catch(Exception e)
            {
                System.out.println("Sorry. That's not a valid input.");
            }
        }

        //calculation
        int years = (int)(72/r);

        //output statement
        System.out.println("It will take "+ years +" years to double your initial investment.");
    }
    }
