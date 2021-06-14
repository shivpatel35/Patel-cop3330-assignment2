/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Shiv Patel
 */

package ex33;

import java.util.Random;
import java.util.Scanner;

public class APP {
    public static void main (String[] args) {

        //response array declaration
        String[] responseArray = {"Yes", "No", "Maybe", "Ask again later."};

        //Scanner declaration
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your question?");
        String user_question = scanner.nextLine();

        Random r = new Random();
        int randomNumber = r.nextInt(responseArray.length);
        System.out.print(responseArray[randomNumber]);


    }

        public static String eightballrandomizer(String[] responseArray){

            int rnd = new Random().nextInt(responseArray.length);
            return responseArray[rnd];
        }




}
