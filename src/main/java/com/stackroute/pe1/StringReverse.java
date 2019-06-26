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
        char[] str = string.toCharArray();
        for (int i = 0; i < str.length/2 ;i++) {
            char temp;
            temp = str[i];
            str[i] = str[str.length-1-i];
            str[str.length-1-i] = temp;
        }
        return new String(str);
    }
}
