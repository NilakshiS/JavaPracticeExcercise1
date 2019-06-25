package com.stackroute.pe1;

import java.util.Scanner;

public class NthIterationPattern {
    public static void main(String[] args) {
        int userInput;
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter a number: ");
        userInput = inputObject.nextInt();

        for (int i = 1;i<=userInput;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}

