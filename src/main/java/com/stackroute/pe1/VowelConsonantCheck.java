/*
The checkLetter method takes a word as input and checks for each single
character letter in the word whether it is a consonant or vowel.
It prints an error message if the input is not a letter
Otherwise it prints Vowel or Consonant for each letter
 */
package com.stackroute.pe1;

import java.util.Scanner;

public class VowelConsonantCheck {
    public static void main(String[] args) {
        String userInput;
        Scanner inputObject = new Scanner(System.in);

        System.out.println("Enter word to be checked: ");
        userInput = inputObject.nextLine();

        VowelConsonantCheck vowelConsonantCheck = new VowelConsonantCheck();
        System.out.println(vowelConsonantCheck.checkLetter(userInput));

    }
    public String checkLetter(String word) {

        if (word == null)                                                         //check for null inputs
            return null;

        word = word.trim();                                                       //remove extra spaces

        String output = "";
        for (int i = 0;i<word.length();i++) {                                     //run loop for each character in word
            char letter = word.charAt(i);                                         //get the character
            if (!Character.isLetter(letter)){                                     //if not a letter give error
                output += "Error! not a letter! ";
            }
            else {
                if (Character.toString(letter).matches("[aeiouAEIOU]")) {   //check if character is a vowel
                    output += "Vowel ";
                }
                else {
                    output += "Consonant ";                                       //if not then its a consonant
                }
            }
        }
        return output;
    }
}
