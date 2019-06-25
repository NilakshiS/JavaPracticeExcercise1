package com.stackroute.pe1;

import java.util.Scanner;

public class VowelConsonantCheck {
    public static void main(String[] args) {
        String userInput;
        Scanner inputObject = new Scanner(System.in);

        System.out.println("Enter word to be checked: ");
        userInput = inputObject.nextLine();

        for (int i = 0;i<userInput.length();i++) {
            char letter = userInput.charAt(i);
            if (!Character.isLetter(letter)){
                System.out.println("Error! not a letter!");
            }
            else {
                if (letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u') {
                    System.out.print("Vowel ");
                }
                else {
                    System.out.print("Consonant ");
                }
            }

        }
    }
}
