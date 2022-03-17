package com.welin;

import org.junit.Before;
import org.junit.Test;
//import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UtilitiesTest {
    private Utilities utilities;

    @Before
    public void setup(){
        utilities = new Utilities();
        System.out.println("Running...");
    }

    @Test
    public void everyNthChar() {
        assertArrayEquals("el".toCharArray(), utilities.everyNthChar("hello".toCharArray(), 2));
        assertArrayEquals("hello".toCharArray(), utilities.everyNthChar("hello".toCharArray(), 6));
    }

    @Test
    public void removePairs() {
        assertEquals("ABCDEF", utilities.removePairs("AABCDDEFF"), "fail case1");
        assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"), "fail case2");
        assertNull(utilities.removePairs(null), "Did not get null returned when argument passed was null");
        assertEquals("A", utilities.removePairs("AA"), "fail case3");
        assertEquals("", utilities.removePairs(""));
    }


    @Test
   public void converter() {
        assertEquals(300, utilities.converter(10, 5));
    }

    @Test
    public void converter_arithmeticException()throws Exception{
        try {
            utilities.converter(10, 0);
            fail("should be exception");
        } catch (ArithmeticException exception) {
            System.out.println("divided by 0");
        }
    }

    @Test(expected = ArithmeticException.class)
    public void converter_arithmeticException2()throws Exception{
        utilities.converter(10, 0);
    }

    @Test
   public void nullIfOddLength() {
        assertNull(utilities.nullIfOddLength("odd"));
        assertNotNull(utilities.nullIfOddLength("even"));
    }
}