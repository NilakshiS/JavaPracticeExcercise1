/*
The patternGenerator method uses a loop to print the following output:
1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6 . . . nth iteration.
 */
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

        for (int i = 1;i <= number;i++){            //run first loop till the number
            for(int j=1;j <= i;j++){                //run second loop to print the number 'number' times
                output += (i+" ");                  //append to output
            }
        }
        return output;
    }
}

