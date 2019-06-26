package com.stackroute.pe1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortNumberTest {

    static SortNumber sortNumber;

    @BeforeClass
    public static void setUp(){
        sortNumber = new SortNumber();
    }

    @AfterClass
    public static void tearDown() {
        sortNumber = null;
    }

    @Test
    public void givenCorrectSequenceSumLessThanFifteenShouldReturnSortedListAndFalse() {
        //Arrange

        //Act
        String result = sortNumber.sortAndCheck("234534");
        //Assert
        assertEquals("Sorted number in non-increasing order : 544332\n" +
                "Sum of even numbers : 10\n" +
                "False",result);
    }

    @Test
    public void givenCorrectSequenceSumGreaterThanFifteenShouldReturnSortedListAndTrue() {
        //Arrange

        //Act
        String result = sortNumber.sortAndCheck("234534838");
        //Assert
        assertEquals("Sorted number in non-increasing order : 885443332\n" +
                "Sum of even numbers : 26\n" +
                "True",result);
    }

    @Test
    public void givenLettersInSeriesShouldReturnError() {
        //Arrange

        //Act
        String result = sortNumber.sortAndCheck("23ds838");
        //Assert
        assertEquals("Error! please enter only numbers!",result);
    }

}