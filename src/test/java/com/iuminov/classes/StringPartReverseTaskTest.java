package com.iuminov.classes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static com.iuminov.classes.StringPartReverseTask.reverseStringPart;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class StringPartReverseTaskTest {

    @Test
    public void testValidInputHappyPath() {
        int i = 2;
        int j = 4;
        char[] array = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        String expectedResult = "abedcfg";
        String actualResult = reverseStringPart(i, j, array);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testValidInputEmptyString() {
        int i = 0;
        int j = 0;
        char[] array = new char[]{};

        String expectedResult = "";
        String actualResult = reverseStringPart(i, j, array);

        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidI1nputNullString() {
        int i = 1;
        int j = 3;
        char[] array = null;

        reverseStringPart(i, j, array);
    }
}