package com.stackroute.pe1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SeriesSumTest {
    static SeriesSum seriesSum;

    @BeforeClass
    public static void setUp() {
        seriesSum = new SeriesSum();
    }

    @AfterClass
    public static void tearDown() {
        seriesSum = null;
    }

    @Test
    public void givenSeriesOfPositiveNumbersShouldReturnCorrectAnswer() {
        //Arrange

        //Act
        int result = seriesSum.getSum("12 3 5 ");
        //Assert
        assertEquals(20,result);
    }

    @Test
    public void givenSeriesOfNegativeAndPositiveNumbersShouldReturnCorrectAnswer() {
        //Arrange

        //Act
        int result = seriesSum.getSum("-12 3 5 ");
        //Assert
        assertEquals(-4,result);
    }

    @Test
    public void givenNonDigitInSeriesShouldReturnZero() {
        //Arrange

        //Act
        int result = seriesSum.getSum("12 3 5 s ");
        //Assert
        assertEquals(0,result);
    }

    @Test
    public void givenDashInSeriesShouldReturnZero() {
        //Arrange

        //Act
        int result = seriesSum.getSum("12 - 3 5 s ");
        //Assert
        assertEquals(0,result);
    }

    @Test
    public void givenDashBetweenNumbersShouldReturnZero() {
        //Arrange

        //Act
        int result = seriesSum.getSum("12-34 3 5 s ");
        //Assert
        assertEquals(0,result);
    }
}