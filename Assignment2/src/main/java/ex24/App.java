package ex24;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Shiv Patel
 */

//pre-processor declarations
import java.util.Arrays;
import java.util.Scanner;

//main
public class App {
    public static void main(String[] args){

        //scanner declaration of strings
        Scanner scanner = new Scanner(System.in);

        //User input for strings to be compared
        System.out.println("Enter two strings and I'll tell you if they are anagrams");
        System.out.println("Enter the first string: ");
        String word1 = scanner.nextLine();

        System.out.println("Enter the second string: ");
        String word2 = scanner.nextLine();

        //use function to check if strings are anagrams or not and prints statement
        if(checkanagram(word1,word2)){
            System.out.print(word1 +"  and "+ word2 +" are Anagrams" );
        }
        else{
            System.out.print(word1 + " and "+word2+" are not Anagrams");
        }

    }

    public static boolean checkanagram(String word1, String word2) {

        //Removes white space from strings
        word1 = word1.replaceAll("\\s", "");
        word2 = word2.replaceAll("\\s", "");

        // Check if the words length match if not returns false
        if (word1.length() != word2.length())
            return false;

        //if length matches
        else {
            // Convert both Strings into lower case and into Character Array
            char[] arr1 = word1.toLowerCase().toCharArray();
            char[] arr2 = word2.toLowerCase().toCharArray();

            // Sort both Character Array
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Check if both arrays are equal
            return (Arrays.equals(arr1, arr2));
        }
    }
}
