package com.iuminov.classes;

import java.util.Scanner;

public class PalindromeTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        System.out.println(testPalindrome(inputString));
    }

    static String testPalindrome(String inputString) {

        char[] stingChars = inputString.toCharArray();
        int length = stingChars.length;
        boolean isPalindrome = true;

        for (int i = 0; i < length / 2; i++) {
            if (stingChars[i] != stingChars[length - i - 1]) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome ? "is palindrome" : "isn't palindrome";
    }
}
