package com.iuminov.classes;

import java.util.Arrays;
import java.util.Scanner;

public class RestoreArrayTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] array = new int[length];

		for (int i = 0; i < length; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println(restoreArray(length, array));
	}

	static String restoreArray(int length, int[] array) {

		for (int i = 2; i < length; i++) {
			if (array[i] < 0) {
				array[i] = 2 * array[i - 1] - array[i - 2];
			}
		}

		return Arrays.toString(array);
	}
}
