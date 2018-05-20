package com.iuminov.classes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static com.iuminov.classes.FrequencyOfCharTask.countChars;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class FrequencyOfCharTaskTest {

    @Test
    public void testMultipleCharsInString() {
        String str = "CharTask";
        char ch = 'a';

        int expectedResult = 2;
        int actualResult = countChars(ch, str);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSingleCharInString() {
        String str = "SingleBInCHar";
        char ch = 'B';

        int expectedResult = 1;
        int actualResult = countChars(ch, str);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEmptyStringInput() {
        String str = "";
        char ch = 'd';

        int expectedResult = 0;
        int actualResult = countChars(ch, str);

        assertEquals(expectedResult, actualResult);
    }
}