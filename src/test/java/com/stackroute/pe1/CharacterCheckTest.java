package com.stackroute.pe1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterCheckTest {
    static CharacterCheck characterCheck;

    @BeforeClass
    public static void setUp() {
        characterCheck = new CharacterCheck();
    }

    @AfterClass
    public static void tearDown() {
        characterCheck = null;
    }

    @Test
    public void givenDigitShouldReturnDigit() {
        //arrange

        //act
        String result = characterCheck.charCheck('4');
        //assert
        assertEquals("Digit",result);
    }

    @Test
    public void givenUpperCaseShouldReturnCapitalLetter() {
        //arrange

        //act
        String result = characterCheck.charCheck('A');
        //assert
        assertEquals("Capital Letter",result);
    }

    @Test
    public void givenLowerCaseShouldReturnSmallCaseLetter() {
        //arrange

        //act
        String result = characterCheck.charCheck('a');
        //assert
        assertEquals("Small Case Letter",result);
    }

    @Test
    public void givenSpecialCharacterShouldReturnSpecialCharacter() {
        //arrange

        //act
        String result = characterCheck.charCheck('*');
        //assert
        assertEquals("Special Character",result);
    }
}