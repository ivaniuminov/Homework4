package com.iuminov.classes;

import java.util.Arrays;
import java.util.Scanner;

public class StringPartReverseTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        sc.nextLine();
        char[] array = sc.nextLine().toCharArray();

        System.out.println(reverseStringPart(i, j, array));
    }

    static String reverseStringPart(int i, int j, char[] array) {
        char temp;

        for (int k = 0; k < j - i; k++) {
            temp = array[i + k];
            array[i + k] = array[j - k];
            array[j - k] = temp;
        }

        return String.valueOf(array);
    }
}
