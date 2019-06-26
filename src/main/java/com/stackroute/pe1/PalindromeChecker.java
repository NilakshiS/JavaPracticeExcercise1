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
        String output = "";

        boolean flag = true;
        for (int i = number.length()-1;i>=number.length()/2;i--){
            if (number.charAt((number.length()-1)-i)!=number.charAt(i)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            output += "The number is palindrome ";
            int sum = 0;
            for (int i = 0;i<number.length();i++){
                int num = number.charAt(i)-48;
                sum += (num%2==0?num:0);
            }
            if (sum > 25) {
                output += "and sum of even numbers is greater than 25";
            }
            else {
                output += "and sum of even numbers is less than 25";
            }
        }
        else {
            output += "The number is not palindrome";
        }
        return output;
    }
}
