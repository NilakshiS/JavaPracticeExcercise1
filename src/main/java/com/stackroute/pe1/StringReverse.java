/*
The reverse method reverses any string without using String Buffer
 */
package com.stackroute.pe1;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        String userInput;
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter the string: ");
        userInput = inputObject.nextLine();

        StringReverse stringReverse = new StringReverse();

        System.out.println(stringReverse.reverse(userInput));
    }
    public String reverse (String string) {
        if (string == null)                                                 //check for null inputs
            return null;

        if (string.replaceAll("\\s+","").length() == 0)   //check if input has only spaces
            return string;

        string = string.trim();                                            //remove extra spaces

        char[] str = string.toCharArray();
        for (int i = 0; i < str.length/2 ;i++) {                           //run loop till half the length
            char temp;                                                     //swap first and last letter, second and second last letter and so on
            temp = str[i];
            str[i] = str[str.length-1-i];
            str[str.length-1-i] = temp;
        }
        return new String(str);
    }
}
