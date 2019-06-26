package com.stackroute.pe1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class NthIterationPatternTest {
    static NthIterationPattern nthIterationPattern;

    @BeforeClass
    public static void setUp() {
        nthIterationPattern = new NthIterationPattern();
    }

    @AfterClass
    public static void tearDown() {
        nthIterationPattern = null;
    }

    @Test
    public void givenNumberShouldReturnPattern() {
        //arrange

        //act
        String result = nthIterationPattern.patternGenerator(3);
        //assert
        assertEquals("1 2 2 3 3 3 ",result);
    }

    @Test
    public void givenZeroShouldReturnEmptyString() {
        //arrange

        //act
        String result = nthIterationPattern.patternGenerator(0);
        //assert
        assertEquals("",result);
    }

    @Test
    public void givenNegativeNumberShouldReturnEmptyString() {
        //arrange

        //act
        String result = nthIterationPattern.patternGenerator(-2);
        //assert
        assertEquals("",result);
    }
}