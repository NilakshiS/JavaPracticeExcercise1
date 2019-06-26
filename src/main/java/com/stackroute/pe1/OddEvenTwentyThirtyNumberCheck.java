package com.stackroute.pe1;

import java.util.Scanner;

public class OddEvenTwentyThirtyNumberCheck {
    public static void main(String[] args) {
        int inputNumber;
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        inputNumber = inputObject.nextInt();

        OddEvenTwentyThirtyNumberCheck oddEvenTwentyThirtyNumberCheck = new OddEvenTwentyThirtyNumberCheck();
        System.out.println(oddEvenTwentyThirtyNumberCheck.checkNumber(inputNumber));
    }
    public String checkNumber(int number) {
        String output = "";
        if (number>20 && number<30) {
            output = ((number%2==0)?"Jerry":"Tom");
        }
        return output;
    }
}
