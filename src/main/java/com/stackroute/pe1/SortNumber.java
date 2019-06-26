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
        char[] numberArray = number.toCharArray();
        String message = "";

        for (int i = 0; i < number.length(); i++) {
            if (!Character.isDigit(numberArray[i])) {
                message = "Error! please enter only numbers!";
                return message;
            }
        }

        message += "Sorted number in non-increasing order : ";

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
            int num = (int) numberArray[i] - 48;
            sum += (num%2==0?num:0);
        }

        message += "\nSum of even numbers : "+sum;

        message += (sum>15?"\nTrue":"\nFalse");
        return message;
    }
}
