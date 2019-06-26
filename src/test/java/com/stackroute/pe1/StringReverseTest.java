package com.stackroute.pe1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {

    static StringReverse stringReverse;

    @BeforeClass
    public static void setUp() {
        stringReverse  = new StringReverse();
    }

    @AfterClass
    public static void tearDown() {
        stringReverse = null;
    }

    @Test
    public void givenStringShouldReturnReversedString() {
        //arrange

        //Act
        String result = stringReverse.reverse("london");
        //Assert
        assertEquals("nodnol",result);
    }

    @Test
    public void givenSpaceShouldReturnSpace() {
        //arrange

        //Act
        String result = stringReverse.reverse(" ");
        //Assert
        assertEquals(" ",result);
    }

    @Test
    public void givenCharacterShouldReturnCharacter() {
        //arrange

        //Act
        String result = stringReverse.reverse("a");
        //Assert
        assertEquals("a",result);
    }

}