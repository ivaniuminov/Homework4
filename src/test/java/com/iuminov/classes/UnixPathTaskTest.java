package com.iuminov.classes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static com.iuminov.classes.UnixPathTask.execute;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class UnixPathTaskTest {

    @Before
    public void clearCache() {
        UnixPathTask.cacheStack.clear();
    }

    @Test
    public void testValidInputHappyPath() {
        String input = "/home/mate/academy/./../a";

        String expectedResult = "/home/mate/a";
        String actualResult = execute(input);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testValidInputEmptyPath() {
        String input = "";

        String expectedResult = "/";
        String actualResult = execute(input);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testValidInputDoubleReturn() {
        String input = "/a/b/../../";

        String expectedResult = "/";
        String actualResult = execute(input);

        assertEquals(expectedResult, actualResult);
    }
}