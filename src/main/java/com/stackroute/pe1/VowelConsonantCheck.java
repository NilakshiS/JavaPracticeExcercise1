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
        String output = "";
        for (int i = 0;i<word.length();i++) {
            char letter = word.charAt(i);
            if (!Character.isLetter(letter)){
                output += "Error! not a letter! ";
            }
            else {
                if (letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u') {
                    output += "Vowel ";
                }
                else {
                    output += "Consonant ";
                }
            }
        }
        return output;
    }
}
