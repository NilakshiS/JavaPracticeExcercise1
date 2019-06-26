package com.stackroute.pe1;

import java.util.Scanner;

public class NRepeatPattern {
    public static void main(String[] args) {
        String stringInput;
        int numberInput;

        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter the string: ");
        stringInput = inputObject.nextLine();
        System.out.println("Enter the number n: ");
        numberInput = inputObject.nextInt();

        NRepeatPattern nRepeatPattern = new NRepeatPattern();

        System.out.println(nRepeatPattern.patternGenerator(stringInput,numberInput));
    }
    public String patternGenerator(String string,int number) {
        String output = "";
        output += string;

        for (int i = 0; i < number; i++) {
            output += string.substring(string.length()-number);
        }
        return output;
    }
}
