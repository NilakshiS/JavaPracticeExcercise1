/*
The getSum method accepts an unspecified number of integer arguments as a string
and adds them together. It displays the total of the given numbers and displays an
error message if there are any non integer values
 */
package com.stackroute.pe1;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        String userInput;

        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        userInput = inputObject.nextLine();

        SeriesSum seriesSum = new SeriesSum();

        System.out.println("Sum of the numbers is: "+seriesSum.getSum(userInput));
    }

    public int getSum(String input) {
        if (input == null)                                                  //check for null input
            return 0;

        input = input.trim();                                               //trim to remove extra spaces

        int sum = 0;

        String[] numbers = input.split("\\s+");                      //split numbers based on space
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length(); j++) {

                //if you encounter a '-' check if there is a number next to it like -12
                //and the '-' should be in beginning of string, so that it does not match 12-13
                //also - should not be at end of string
                //and the character next to '-' should be a number
                if(numbers[i].charAt(j) == '-' && j == 0 && j+1<numbers[i].length() && Character.isDigit(numbers[i].charAt(j+1))){
                    continue;
                }
                // if check fails give error
                else if (!Character.isDigit(numbers[i].charAt(j))) {
                    System.out.println("Error! non integer values!");
                    return 0;
                }
            }
            sum += Integer.parseInt(numbers[i]);                          //convert string to integer by using parseInt
        }
        return sum;
    }
}
