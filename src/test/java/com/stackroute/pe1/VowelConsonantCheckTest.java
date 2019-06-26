package com.stackroute.pe1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantCheckTest {
    static VowelConsonantCheck vowelConsonantCheck;

    @BeforeClass
    public static void setUp() {
        vowelConsonantCheck = new VowelConsonantCheck();
    }

    @AfterClass
    public static void tearDown() {
        vowelConsonantCheck = null;
    }

    @Test
    public void givenSingleVowelShouldReturnVowel() {
        //Arrange

        //Act
        String result = vowelConsonantCheck.checkLetter("a");
        //Assert
        assertEquals("Vowel ",result);
    }

    @Test
    public void givenSingleConsonantShouldReturnConsonant() {
        //Arrange

        //Act
        String result = vowelConsonantCheck.checkLetter("b");
        //Assert
        assertEquals("Consonant ",result);
    }

    @Test
    public void givenStringShouldReturnCorrectMessage() {
        //Arrange

        //Act
        String result = vowelConsonantCheck.checkLetter("abcde");
        //Assert
        assertEquals("Vowel Consonant Consonant Consonant Vowel ",result);
    }

    @Test
    public void givenNonLetterInStringShouldReturnError() {
        //Arrange

        //Act
        String result = vowelConsonantCheck.checkLetter("ab3e4");
        //Assert
        assertEquals("Vowel Consonant Error! not a letter! Vowel Error! not a letter! ",result);
    }
}