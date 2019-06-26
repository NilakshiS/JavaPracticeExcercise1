package com.stackroute.pe1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumberTest {
    static GuessNumber guessNumber;

    @BeforeClass
    public static void setUp() {
        guessNumber = new GuessNumber();
    }

    @AfterClass
    public static void tearDown() {
        guessNumber = null;
    }

    @Test
    public void givenLesserNumberShouldReturnLesserNumberMessage() {
        //Arrange

        //Act
        String result = guessNumber.userGuess(5,3);
        //Assert
        assertEquals("Number guessed is less than the original number",result);
    }

    @Test
    public void givenGreaterNumberShouldReturnGreaterNumberMessage() {
        //Arrange

        //Act
        String result = guessNumber.userGuess(5,7);
        //Assert
        assertEquals("Number guessed is greater than the original number",result);
    }

    @Test
    public void givenSameNumberShouldReturnMatchesNumberMessage() {
        //Arrange

        //Act
        String result = guessNumber.userGuess(5,5);
        //Assert
        assertEquals("Number guessed matches the original number",result);
    }

}