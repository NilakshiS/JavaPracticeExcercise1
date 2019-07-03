/*
The checkForPalindrome method takes a number as parameter and checks whether the given number is
palindrome or not.
If it is a palindrome then
It adds all the even numbers and check whether the sum is more than 25.
Returns appropriate message
 */

package com.stackroute.pe1;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        String inputNumber;
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        inputNumber = inputObject.nextLine();
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        System.out.println(palindromeChecker.checkForPalindrome(inputNumber));

    }
    public String checkForPalindrome(String number){
        if (number == null)                                                 //check for null input
            return null;

        if (!number.matches("^[0-9]+$"))                             //check for non numeric inputs
            return null;

        number = number.trim();                                            // trim string for extra spaces


        String output = "";

        boolean flag = true;                                                //flag to denote that check failed
        for (int i = number.length()-1;i>=number.length()/2;i--){           //run loop till half string length
            if (number.charAt((number.length()-1)-i)!=number.charAt(i)) {   //check if number at first and last, sec-...
                flag = false;                                               //... -ond and second last & so on are same
                break;                                                      //if not put flag false and break
            }
        }
        if (flag) {                                                         //if flag is still true check passed
            output += "The number is palindrome ";
            int sum = 0;
            for (int i = 0;i<number.length();i++){
                int num = number.charAt(i)-48;                              //-48 to covert from ascii value to number
                sum += (num%2==0?num:0);                                    //if even add number otherwise add 0
            }
            if (sum > 25) {
                output += "and sum of even numbers is greater than 25";
            }
            else {
                output += "and sum of even numbers is less than 25";
            }
        }
        else {                                                              //if check failed flag would be false
            output += "The number is not palindrome";
        }
        return output;
    }
}
