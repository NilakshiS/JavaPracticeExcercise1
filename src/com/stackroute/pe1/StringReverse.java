package com.stackroute.pe1;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        char[] userInput;
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter the string: ");
        userInput = inputObject.nextLine().toCharArray();

        for (int i = 0; i < userInput.length/2 ;i++) {
            char temp;
            temp = userInput[i];
            userInput[i] = userInput[userInput.length-1-i];
            userInput[userInput.length-1-i] = temp;
        }

        System.out.println(userInput);
    }
}
