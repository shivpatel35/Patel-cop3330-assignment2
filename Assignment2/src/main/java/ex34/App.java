/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Shiv Patel
 */

package ex34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main (String[] args) {

        //Scanner declaration
        Scanner scanner = new Scanner(System.in);

        //initialize Array and employee statement
        String[] employees = {"John Smith", "Jackie Johnson", "Chris Jones","Amanda Cullen","Jeremy Goodwin"};


        //prints employees
        printEmployees(employees);

        //converts array to string
        List<String> list = new ArrayList<String>(Arrays.asList(employees));

        //asks for user input to remove name
        System.out.print("\nEnter an employee name to remove: ");
        list.remove(scanner.nextLine());

        //intialize new Array and convert list back to array to print employees left
        String[] itemsArray = new String[list.size()];
        itemsArray = list.toArray(itemsArray);

        printEmployees(itemsArray);

    }

    public static void printEmployees(String[] employees){

        System.out.print("\nThere are " +employees.length+ " employees:\n");

        //for-loop to print out employees names based on length of array
        for(int i = 0; i < employees.length ; i++){
            System.out.println(employees[i]);
        }
    }
}
