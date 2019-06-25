package com.stackroute.pe1;

import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {
        char userInput;
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter a character: ");
        userInput = inputObject.next().charAt(0);

        if (Character.isDigit(userInput)) {
            System.out.println("Digit");
        }
        else if (Character.isUpperCase(userInput)) {
            System.out.println("Capital Letter");
        }
        else if (Character.isLowerCase(userInput)) {
            System.out.println("Small Case Letter");
        }
        else if (!Character.isLetterOrDigit(userInput)) {
            System.out.println("Special Character");
        }
    }
}
