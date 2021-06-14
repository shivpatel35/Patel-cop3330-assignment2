/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Shiv Patel
 */

package ex31;

import java.util.Scanner;

public class App {

    public static void main (String[] args)
    {
        // Variable and Scanner Declaration
        int restingHR= 0;
        int age = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter resting pulse: ");
        restingHR = sc.nextInt();

        System.out.print("Enter the age: ");
        age = sc.nextInt();

        System.out.println("Resting Pulse: " + restingHR + " Age: " + age);

        System.out.println("Intensity | Rate ");
        System.out.println("------------------------");

        for(int i=55;i<=95;i+=5)
        {
            int heartRate=(int)Math.round((((220-age)-restingHR)*(i/100.0))+restingHR);
            System.out.println(i+"% | "+heartRate+"bpm");
        }
        }
    }

