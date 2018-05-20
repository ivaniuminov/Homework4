package com.iuminov.classes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static com.iuminov.classes.RangesTask.findRanges;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class RangesTaskTest {

    @Test
    public void testValidInputOnlyRanges() {
        int length = 8;
        int[] array = new int[]{1, 2, 3, 5, 6, 7, 9, 10};

        String expectedResult = "[1 3][5 7][9 10]";
        String actualResult = findRanges(length, array);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testValidInputOnlySingleElements() {
        int length = 8;
        int[] array = new int[]{1, 3, 5, 7, 9, 11, 13, 15};

        String expectedResult = "[1][3][5][7][9][11][13][15]";
        String actualResult = findRanges(length, array);

        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testInvalidInputInputLengthIsGreaterThanActual() {
        int length = 9;
        int[] array = new int[]{1, 2, 3, 5, 6, 7, 9, 10};

        findRanges(length, array);
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidInputNullArray() {
        int length = 8;
        int[] array = null;

        findRanges(length, array);
    }
}