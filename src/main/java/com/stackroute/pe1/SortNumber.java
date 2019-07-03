/*
The sortAndCheck method accepts a number and performs the following:
a. sorts the number in non-increasing order
b. after sorting calculates sum all the even numbers
c. if sum is more than 15,then returns true otherwise false.
 */
package com.stackroute.pe1;

import java.util.Scanner;

public class SortNumber {
    public static void main(String[] args) {
        String userInput;
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter a number: ");
        userInput = inputObject.nextLine();

        SortNumber sortNumber = new SortNumber();

        System.out.println(sortNumber.sortAndCheck(userInput));
    }
    public String sortAndCheck(String number){
        if (number == null)                                                                 //check for null inputs
            return null;

        number = number.trim();                                                             //remove extra spaces

        char[] numberArray = number.toCharArray();
        String message = "";

        for (int i = 0; i < number.length(); i++) {
            if (!Character.isDigit(numberArray[i])) {                                       //check if there is any non numeric value
                message = "Error! please enter only numbers!";
                return message;
            }
        }

        message += "Sorted number in non-increasing order : ";

                                                                                            //sorting using bubble sort
        for (int i = 0; i < numberArray.length-1; i++){

            int greatestIndex = i;
            for (int j = i+1; j < number.length(); j++) {
                if ((int) numberArray[greatestIndex] - 48 < (int) numberArray[j] - 48) {
                    greatestIndex = j;
                }
            }
            if (greatestIndex != i) {
                char temp;
                temp = numberArray[i];
                numberArray[i] = numberArray[greatestIndex];
                numberArray[greatestIndex] = temp;
            }
        }

        message += new String(numberArray);

        int sum = 0;

        for (int i = 0; i < numberArray.length; i++) {
            int num = (int) numberArray[i] - 48;                                             //-48 to convert from ascii value to number
            sum += (num%2==0?num:0);                                                         //add the number if even number otherwise add 0
        }

        message += "\nSum of even numbers : "+sum;

        message += (sum>15?"\nTrue":"\nFalse");
        return message;
    }
}
