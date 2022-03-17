package com.welin;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {
    private Utilities utilities;
    private String expected;
    private String input;

    public UtilitiesTestParameterized(String expected, String input) {
        this.expected = expected;
        this.input = input;
    }

    @Before
    public void setup() {
        utilities = new Utilities();
        System.out.println("Running a test...");
    }

    @Parameterized.Parameters
    public static Collection<Object> testConditions() {
        return Arrays.asList(new Object[][]{
                {"ABCDEF", "ABCDEFF"},
                {"AB8EFG", "AB88EFFG"},
                {"123456", "112233445566"},
                {"ZYZQB", "ZYZQQB"},
                {"A", "A"}
        });
    }

    @Test
    public void removePairs() {
        assertEquals(expected, utilities.removePairs(input), "fail case");
    }


}
