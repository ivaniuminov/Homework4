package com.iuminov.classes;

import java.util.Scanner;

public class RangesTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] array = new int[length];
		
		for (int i = 0; i < length; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println(findRanges(length, array));
	}

	static String findRanges(int length, int[] array) {
		StringBuffer result = new StringBuffer();
		boolean isFirstElement = true;
		boolean isSingle = false;

		for (int i = 0; i < length - 1; i++) {
			if (isFirstElement) {
				result.append("[" + array[i]);
				isFirstElement = false;
				isSingle = true;
			}
			if (array[i + 1] - array[i] != 1) {
				result.append((isSingle) ? "]" : " " + array[i] + "]");
				isFirstElement = true;
			} else {
				isSingle = false;
			}
		}

		result.append((isFirstElement) ? "[" + array[length - 1] + "]" : " " + array[length - 1] + "]");
		return  result.toString();
	}

}
