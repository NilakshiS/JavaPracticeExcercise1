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
        int sum = 0;

        String[] numbers = input.split("\\s+");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length(); j++) {
                if(numbers[i].charAt(j) == '-' && j == 0 && j+1<numbers[i].length() && Character.isDigit(numbers[i].charAt(j+1))){
                    continue;
                }
                else if (!Character.isDigit(numbers[i].charAt(j))) {
                    System.out.println("Error! non integer values!");
                    return 0;
                }
            }
            sum += Integer.parseInt(numbers[i]);
        }
        return sum;
    }
}
