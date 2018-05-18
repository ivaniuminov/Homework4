package com.iuminov.classes;

import java.util.Scanner;

public class FrequencyOfCharTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		sc.nextLine();
		String str = sc.nextLine();

		System.out.println(countChars(ch, str));
	}

	static int countChars(char ch, String str) {
		char[] array = str.toCharArray();
		int counter = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == ch) {
				counter++;
			}
		}

		return counter;
	}
}
