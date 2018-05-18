package com.iuminov.classes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static com.iuminov.classes.UnixPathTask.execute;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class UnixPathTaskTest {

    @Test
    public void testValidInputHappyPath() {
        String input = "/home/mate/academy/./../a";

        String expectedResult = "/home/mate/a";
        String actualResul = execute(input);

        assertEquals(expectedResult, actualResul);
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