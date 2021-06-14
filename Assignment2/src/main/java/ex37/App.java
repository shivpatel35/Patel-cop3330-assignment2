package ex37;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int lengthCount = 0;
        int specialCharCount = 0;
        int numOfNumbersCount = 0;
        String password = "";

        List<String> letters = new ArrayList<>(
                List.of("a", "b", "c", "d", "e",
                        "f", "g", "h", "i", "j",
                        "k", "l", "m", "n", "o",
                        "p", "q", "r", "s", "t",
                        "u", "v", "w", "x", "y", "z"));

        List<String> numbers = new ArrayList<> (
                List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "0"));

        List<String> symbols = new ArrayList<> (
                List.of("!", "(", ")", "-", ".", "?", "[", "]", "_", "`", "~", ";",
                        "@", "#", "$", "%", "^", "&", "*", "+", "="));

        System.out.print("What's the minimum length? ");
        int length = sc.nextInt();

        System.out.print("How many special characters? ");
        int specialChar = sc.nextInt();

        System.out.print("How many numbers? ");
        int numOfNumbers = sc.nextInt();

        while(lengthCount < length || specialCharCount < specialChar || numOfNumbersCount < numOfNumbers) {
            if (specialCharCount == specialChar) {
                if (numOfNumbersCount == numOfNumbers) {
                    int randomNum = rand.nextInt(((letters.size()-1) - 0) + 1) + 0;
                    password = password + letters.get(randomNum);
                    lengthCount++;
                } else {
                    int chance = rand.nextInt((2 - 1) + 1) + 1;
                    if (chance == 2) {
                        int randomNum = rand.nextInt(((letters.size()-1) - 0) + 1) + 0;
                        password = password + letters.get(randomNum);
                        lengthCount++;
                    } else {
                        int randomNum = rand.nextInt(((numbers.size()-1) - 0) + 1) + 0;
                        password = password + numbers.get(randomNum);
                        numOfNumbersCount++;
                        lengthCount++;
                    }
                }
            } else if (numOfNumbersCount == numOfNumbers) {
                int chance = rand.nextInt((2 - 1) + 1) + 1;
                if (chance == 2) {
                    int randomNum = rand.nextInt(((letters.size()-1) - 0) + 1) + 0;
                    password = password + letters.get(randomNum);
                    lengthCount++;
                } else {
                    int randomNum = rand.nextInt(((symbols.size()-1) - 0) + 1) + 0;
                    password = password + symbols.get(randomNum);
                    specialCharCount++;
                    lengthCount++;
                }
            } else {
                int chance = rand.nextInt((3 - 1) + 1) + 1;
                if (chance == 3) {
                    int randomNum = rand.nextInt(((letters.size()-1) - 0) + 1) + 0;
                    password = password + letters.get(randomNum);
                    lengthCount++;
                } else if (chance == 2){
                    int randomNum = rand.nextInt(((numbers.size()-1) - 0) + 1) + 0;
                    password = password + numbers.get(randomNum);
                    numOfNumbersCount++;
                    lengthCount++;
                } else if (chance == 1) {
                    int randomNum = rand.nextInt(((symbols.size()-1) - 0) + 1) + 0;
                    password = password + symbols.get(randomNum);
                    specialCharCount++;
                    lengthCount++;
                }
            }
        }

        System.out.print("Your password is " + password);

        sc.close();
    }
}
