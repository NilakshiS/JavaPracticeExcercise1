package com.stackroute.pe1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class NRepeatPatternTest {
    static NRepeatPattern nRepeatPattern;

    @BeforeClass
    public static void setUp() {
        nRepeatPattern = new NRepeatPattern();
    }

    @AfterClass
    public static void tearDown() {
        nRepeatPattern = null;
    }

    @Test
    public void givenOneStringOneNumberShouldReturnString() {
        //arrange

        //act
        String result = nRepeatPattern.patternGenerator("Stackroute",2);
        //assert
        assertEquals("Stackroutetete",result);
    }

    @Test
    public void givenOneSpacesStringOneNumberShouldReturnSpacesString() {
        //arrange

        //act
        String result = nRepeatPattern.patternGenerator("   ",2);
        //assert
        assertEquals("       ",result);
    }

    @Test
    public void givenOneStringOneZeroShouldReturnInputString() {
        //arrange

        //act
        String result = nRepeatPattern.patternGenerator("Stack",0);
        //assert
        assertEquals("Stack",result);
    }

}