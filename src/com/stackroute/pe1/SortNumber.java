package com.stackroute.pe1;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumber {
    public static void main(String[] args) {
        String userInput;
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter a number: ");
        userInput = inputObject.nextLine();
        char[] numberArray = userInput.toCharArray();

        for (int i = 0; i < numberArray.length-1; i++){
            int leastindex = i;

            for (int j = i+1; j < userInput.length(); j++) {
                if ((int) numberArray[leastindex] - 48 < (int) numberArray[j] - 48) {
                    leastindex = j;

                }
            }
            if (leastindex != i) {
                char temp;
                temp = numberArray[i];
                numberArray[i] = numberArray[leastindex];
                numberArray[leastindex] = temp;
            }
        }

        System.out.println(numberArray);
    }
}
