/*
The userGuess method takes an original number and another number as guess for original number and checks if:
a. Number guessed is more than original number
b. Number guessed is less than original number
c. Number guessed matches the original number
It then accordingly returns the appropriate message
 */

package com.stackroute.pe1;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(10) + 1;
        int userInput;
        String result;

        GuessNumber guessNumber = new GuessNumber();
        do {
            Scanner inputObject = new Scanner(System.in);
            System.out.println("Enter a number (between 1 to 10): ");
            userInput = inputObject.nextInt();
            result = guessNumber.userGuess(targetNumber, userInput);
            System.out.println(result);
        } while (!result.equals("Number guessed matches the original number"));


    }

    public String userGuess(int number, int userInput) {
        if (userInput == number) {                                          //check if number guessed is equal to given number
            return "Number guessed matches the original number";
        } else if (userInput > number) {                                    //check if number guessed is greater than given number
            return "Number guessed is greater than the original number";
        } else {                                                            //otherwise number guessed is lesser than given number
            return "Number guessed is less than the original number";
        }
    }
}
