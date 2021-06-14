/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Shiv Patel
 */

package ex36;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> num = new ArrayList<String>();

        while(true){
            System.out.print("Enter a number: ");
            num.add(scanner.nextLine());

            if(num.contains("done")){
                num.remove("done");
                System.out.print("Numbers: "+ num);
                break;
            }
            String[] stringArray = num.toArray(new String[0]);
             average(stringArray);


        }
        System.out.print(num);

    }
    public static void average(String[] num) {


        for (int i = 0; i < num.length; i++) {
             String total = num[i] + num[i + 1];
        }

    }
}
