/*
The checkNumber method accepts an integer number as parameter and performs the
following conditional checks:
a. Returns Tom if number is odd and exists between 20 to 30
b. Returns Jerry, if number is even and exists between 20 and 30
 */
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
        if (number>20 && number<30) {                       //check if number between 20 and 30
            output = ((number%2==0)?"Jerry":"Tom");         //put jerry if even otherwise tom
        }
        return output;
    }
}
