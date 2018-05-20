package com.iuminov.classes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static com.iuminov.classes.ArrayRotationTask.rotateArray;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ArrayRotationTaskTest {

    @Test
    public void testValidInputHappyPath() {
        int length = 6;
        int k = 3;
        int[] array = new int[]{1, 2, 3, 4, 5, 6};

        String expectedResult = "[4, 5, 6, 1, 2, 3]";
        String actualResult = rotateArray(length, k, array);

        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = NegativeArraySizeException.class)
    public void testInvalidInputNegativeArrayLength() {
        int lenght = -2;
        int k = 2;
        int[] array = new int[]{1, 2, 3, 4, 5, 6};

        rotateArray(lenght, k, array);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testInvalidInputNegativeKValue() {
        int lenght = 5;
        int k = -2;
        int[] array = new int[] {5, 6, 7, 8, 9};

        rotateArray(lenght, k, array);
    }
}