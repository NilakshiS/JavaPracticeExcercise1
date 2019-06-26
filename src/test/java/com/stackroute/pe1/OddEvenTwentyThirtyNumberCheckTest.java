package com.stackroute.pe1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenTwentyThirtyNumberCheckTest {

    static OddEvenTwentyThirtyNumberCheck oddEvenTwentyThirtyNumberCheck;

    @BeforeClass
    public static void setUp() {
        oddEvenTwentyThirtyNumberCheck = new OddEvenTwentyThirtyNumberCheck();
    }

    @AfterClass
    public static void tearDown() {
        oddEvenTwentyThirtyNumberCheck = null;
    }

    @Test
    public void givenOddNumberInRangeShouldReturnTom() {
        //Arrange

        //Act
        String result = oddEvenTwentyThirtyNumberCheck.checkNumber(23);
        //Assert
        assertEquals("Tom",result);

    }

    @Test
    public void givenEvenNumberInRangeShouldReturnJerry() {
        //Arrange

        //Act
        String result = oddEvenTwentyThirtyNumberCheck.checkNumber(26);
        //Assert
        assertEquals("Jerry",result);

    }

    @Test
    public void givenNumberOutOfRangeShouldReturnEmptyString() {
        //Arrange

        //Act
        String result = oddEvenTwentyThirtyNumberCheck.checkNumber(3);
        //Assert
        assertEquals("",result);

    }
}