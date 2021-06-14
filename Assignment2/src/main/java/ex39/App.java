/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Shiv Patel
 */

package ex39;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static ArrayList<Integer> filterEvenNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        for (Integer num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }

        return evenNumbers;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");

        String userInput = sc.nextLine();
        Scanner scanner = new Scanner(userInput);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }

        System.out.print("The even numbers are");
        ArrayList<Integer> result = filterEvenNumbers(numbers);
        for (Integer num : result) {
            System.out.print(" " + num);
        }
        System.out.print(".");

        sc.close();
        scanner.close();
    }

}
