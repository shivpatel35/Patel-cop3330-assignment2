/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Shiv Patel
 */

package ex32;

//pre-processor directives
import java.util.Random;
import java.util.Scanner;

public class App {

        public static void main(String[] args) {

            //scanner declartion and random
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();

            String goAgain = "";

            System.out.println("Let's play Guess the Number!\n");

            //do-while loop
            do {

                //intiliaze variables for the upperbound, dif, guesses, and user guess
                int upperBound = 0;
                int difficulty = 0;
                int numGuesses = 0;
                int userGuess = 0;
                boolean correctInput = false;

                //difficulty level user input statement
                System.out.print("Enter the difficulty level (1, 2, or 3): ");

                //incorrect input reloop to allow user to re guess
                while(correctInput == false) {
                    try {
                        String input = sc.nextLine();
                        difficulty = Integer.parseInt(input);
                        while(difficulty > 3 || difficulty < 1) {
                            System.out.println("That is not a correct input. Try Again.");
                            System.out.print("Enter the difficulty level (1, 2, or 3): ");
                            input = sc.nextLine();
                            difficulty = Integer.parseInt(input);
                        }
                        correctInput = true;
                    }catch(NumberFormatException e) {
                        System.out.println("That is not a correct input. Try Again.");
                        System.out.print("Enter the difficulty level (1, 2, or 3): ");
                    }
                }

                //if-else statement to limit number range based on difficulty
                if (difficulty == 1) {
                    upperBound = 10;
                } else if (difficulty == 2) {
                    upperBound = 100;
                } else {
                    upperBound = 1000;
                }

                //intiliaze random number for program while asks user to guess
                int randomNum = rand.nextInt((upperBound - 1) + 1) + 1;
                System.out.print("I have my number. What's your guess? ");


                while (userGuess != randomNum) {
                    try {
                        String input = sc.nextLine();
                        userGuess = Integer.parseInt(input);
                        numGuesses++;

                        //if else statement to let user guess and to stop and re try if they go out of bounds
                        if (userGuess > upperBound || userGuess < 1) {
                            System.out.print("Not within difficulty bounds. Guess again: ");
                        } else if (userGuess > randomNum) {
                            System.out.print("Too high. Guess again: ");
                        } else if (userGuess < randomNum) {
                            System.out.print("Too low. Guess again: ");
                        }
                        //catches invalid input
                    }catch(NumberFormatException e) {
                        System.out.print("Invalid input. Guess again: ");
                    }
                }

                //Output statement to show number of guesses taken
                System.out.println("You got it in " + numGuesses + " guesses!\n");

                //Statement to ask the user to play again and reloops
                System.out.print("Do you wish to play again (Y/N)? ");
                goAgain = sc.nextLine();

            } while (goAgain.equals("Y") || goAgain.equals("y"));


            sc.close();
        }

}
