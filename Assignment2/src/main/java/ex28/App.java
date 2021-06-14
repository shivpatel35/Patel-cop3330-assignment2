/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Shiv Patel
 */

package ex28;

//pre-processor directives
import java.util.Scanner;

public class App {
    public static void main(String[] args){

    //Scanner declaration
    Scanner scanner = new Scanner(System.in);

    //variable intilization
    int numRead = 0;
    int sum = 0;

    while(true){
        if(numRead == 5) {
            break;
        }

        System.out.print("Enter a number: ");
        sum = sum + Integer.valueOf(scanner.nextLine());
        numRead = numRead + 1;
        }
    System.out.print("The total is "+ sum);
    }
}
