/*
The patternGenerator method given 2 inputs , a string 'string' and an integer value 'number', returns the string
with last 'number' number of characters repeated 'number' number of times in the output String.
 */

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
        if (string == null)                                                 //check for null
            return null;

        if (string.replaceAll("\\s+","").length() == 0)   //check for only spaces
            return string;

        String output = "";
        output += string;                                                  //set output to input string

        for (int i = 0; i < number; i++) {
            output += string.substring(string.length()-number);             //keep adding the substring 'number' times in the end
        }
        return output;
    }
}
