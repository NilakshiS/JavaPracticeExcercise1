/*
The charCheck method takes a character as input and determines whether the
character entered is a capital letter, a small case letter, a digit or a
special symbol and returns the appropriate message.
 */

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

    public String charCheck(char character) {
        if (Character.isDigit(character)) {                //check if it is digit
            return "Digit";
        } else if (Character.isUpperCase(character)) {     //check if it is an uppercase character
            return "Capital Letter";
        } else if (Character.isLowerCase(character)) {     //check if it is a lowercase character
            return "Small Case Letter";
        } else if (!Character.isLetterOrDigit(character)) {//check if it isn't a digit or letter which means it is a special character
            return "Special Character";
        }
        return "";
    }
}
