package com.iuminov.classes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static com.iuminov.classes.PalindromeTask.testPalindrome;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class PalindromeTaskTest {

    @Test
    public void testValidPalindromeString() {
        String str = "abccba";

        String expectedResult = "is palindrome";
        String actualResult = testPalindrome(str);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testInvalidPalindromeString() {
        String str = "notapalindrome";

        String expectedResult = "isn't palindrome";
        String actualResult = testPalindrome(str);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEmptyString() {
        String str = "";

        String expectedResult = "is palindrome";
        String actualResult = testPalindrome(str);

        assertEquals(expectedResult, actualResult);
    }
}