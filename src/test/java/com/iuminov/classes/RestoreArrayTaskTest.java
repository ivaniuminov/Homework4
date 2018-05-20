package com.iuminov.classes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static com.iuminov.classes.RestoreArrayTask.restoreArray;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class RestoreArrayTaskTest {

    @Test
    public void testValidInputHappyPath() {
        int length = 6;
        int[] array = new int[]{1, 2, -4, 14, 16, -5};

        String expectedResult = "[1, 2, 3, 14, 16, 18]";
        String actualResult = restoreArray(length, array);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testValidInputSadPathMultipleNegativeNumbersInRow() {
        int length = 8;
        int[] array = new int[]{1, 2, -4, -4, 16, -5, -5, 9};

        String expectedResult = "[1, 2, 3, 4, 16, 28, 40, 9]";
        String actualResult = restoreArray(length, array);

        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidInputNullArray() {
        int length = 10;
        int[] array = null;

        restoreArray(length, array);
    }
}