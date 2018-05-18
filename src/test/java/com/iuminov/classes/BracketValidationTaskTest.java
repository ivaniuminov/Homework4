package com.iuminov.classes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class BracketValidationTaskTest {

    @Test
    public void testValidInputHappyPath() {
        String str = "{[]}{{(({[]}))}}";
        String expectedResult = "is correct";
        String actualResult = BracketValidationTask.testString(str);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testValidInputSadPath() {
        String str = "{]{(})";
        String expectedResult = "isn't correct";
        String actualResult = BracketValidationTask.testString(str);

        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidInputNullString() {
        String str = null;
        String actualResult = BracketValidationTask.testString(str);
    }
}