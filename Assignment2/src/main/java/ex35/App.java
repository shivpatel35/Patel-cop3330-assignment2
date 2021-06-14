/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Shiv Patel
 */

package ex35;

//pre-processor directives
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


public class App {

        public static void main(String[] args) {

            //Scanner and random declaration
            Random rand = new Random();
            Scanner sc = new Scanner(System.in);

            ///List declaration for names
            ArrayList<String> names = new ArrayList<String>();

            String userInput = "x";

            //while statement to loop to ask user for names until none are added
            while (!userInput.equals("")) {
                System.out.print("Enter a name: ");
                userInput = sc.nextLine();
                names.add(userInput);
            }

            //random winner generator
            int randomNum = rand.nextInt((names.size() - 0) + 1) + 0;

            //user output statement for winner
            System.out.print("The winner is... " + names.get(randomNum) + ".");

            sc.close();

        }
    }
