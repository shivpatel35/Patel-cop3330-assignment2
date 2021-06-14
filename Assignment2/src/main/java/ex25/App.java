
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Shiv Patel
 */

package ex25;

//pre-processor declarations
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args)
    {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);

        //User input
        System.out.println("Enter a password: ");
        String input = scanner.nextLine();

        //Sends to method to check strength of password
        passwordStrength(input);

    }

    public static void passwordStrength(String input)
    {
        //find length of password
        int n = input.length();
        boolean hasLower = false, hasUpper = false,
                hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#','$','%','^','&','*','(',')','+','-'));
        for(char i: input.toCharArray())
        {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }

        System.out.print("Strength of password:- ");
        if ((hasUpper || hasLower) && (n < 8)) {
            System.out.print("The password '" + input + "' is a weak password.");
        }
        else if ((hasDigit) && (n < 8)) {
            System.out.print("The password '" + input + "' is a very weak password.");
        }
        else if((hasDigit || hasLower || hasUpper) && (n >= 8)){
            System.out.print("The password '" + input + "' is a strong password.");
        }
        else if((hasDigit || hasLower || hasUpper && specialChar) && (n >= 8)){
            System.out.print("The password '" + input + "' is a very strong password.");
        }
    }





}

