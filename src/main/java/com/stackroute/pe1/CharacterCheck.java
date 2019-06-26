package com.stackroute.pe1;

import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {
        char userInput;
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter a character: ");
        userInput = inputObject.next().charAt(0);
        CharacterCheck c = new CharacterCheck();
        System.out.println(c.charCheck(userInput));
    }
    public String charCheck (char character) {
        if (Character.isDigit(character)) {
            return "Digit";
        }
        else if (Character.isUpperCase(character)) {
            return "Capital Letter";
        }
        else if (Character.isLowerCase(character)) {
            return "Small Case Letter";
        }
        else if (!Character.isLetterOrDigit(character)) {
            return "Special Character";
        }
        return "";
    }
}
