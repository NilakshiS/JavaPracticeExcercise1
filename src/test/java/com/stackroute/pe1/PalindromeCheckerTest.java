package com.stackroute.pe1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckerTest {
    static PalindromeChecker palindromeChecker;

    @BeforeClass
    public static void setUp() {
        palindromeChecker = new PalindromeChecker();
    }

    @AfterClass
    public static void tearDown() {
        palindromeChecker = null;
    }

    @Test
    public void givenNonNumericInputShouldReturnNull() {
        //Arrange

        //Act
        String result = palindromeChecker.checkForPalindrome("2345e");
        assertNull(result);
        result = palindromeChecker.checkForPalindrome("dskjdjs");
        assertNull(result);
        result = palindromeChecker.checkForPalindrome("jj353");
        assertNull(result);
        result = palindromeChecker.checkForPalindrome("hh6434fd");
        assertNull(result);
        result = palindromeChecker.checkForPalindrome("***3882-2!!");
        assertNull(result);
    }


    @Test
    public void givenNullInputShouldReturnNull() {
        //Arrange

        //Act
        String result = palindromeChecker.checkForPalindrome(null);
        //Assert
        assertNull(result);
    }

    @Test
    public void givenPalindromeWithSumLessThanTwentyFiveShouldReturnPalindromeLessThanTwentyFive() {
        //Arrange

        //Act
        String result = palindromeChecker.checkForPalindrome("624426");
        //Assert
        assertEquals("The number is palindrome and sum of even numbers is less than 25",result);
    }

    @Test
    public void givenPalindromeWithSumGreaterThanTwentyFiveShouldReturnPalindromeGreaterThanTwentyFive() {
        //Arrange

        //Act
        String result = palindromeChecker.checkForPalindrome("6246426");
        //Assert
        assertEquals("The number is palindrome and sum of even numbers is greater than 25",result);
    }

    @Test
    public void givenNonPalindromeShouldReturnNotPalindrome() {
        //Arrange

        //Act
        String result = palindromeChecker.checkForPalindrome("1234");
        //Assert
        assertEquals("The number is not palindrome",result);
    }

    @Test
    public void givenNegativeNumberInputShouldReturnNull() {
        //Arrange

        //Act
        String result = palindromeChecker.checkForPalindrome("-23883");
        //Assert
        assertNull(result);
    }
}