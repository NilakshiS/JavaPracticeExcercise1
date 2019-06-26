package com.stackroute.pe1;

import java.util.Scanner;

public class NthIterationPattern {
    public static void main(String[] args) {
        int userInput;
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter a number: ");
        userInput = inputObject.nextInt();

        NthIterationPattern nthIterationPattern = new NthIterationPattern();
        System.out.println(nthIterationPattern.patternGenerator(userInput));
    }
    public String patternGenerator (int number) {
        String output = "";
        for (int i = 1;i <= number;i++){
            for(int j=1;j <= i;j++){
                output += (i+" ");
            }
        }
        return output;
    }
}

