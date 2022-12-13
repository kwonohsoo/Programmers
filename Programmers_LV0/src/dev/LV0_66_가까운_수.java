package dev;

import java.util.Arrays;

public class LV0_66_가까운_수 {

	public static void main(String[] args) {
		int[] array = { 3, 10, 28 };
		int n = 20;
		int answer = 0;

		Arrays.sort(array);

		for (int i = 0; i < array.length - 1; i++) {
			if (Math.abs(n - array[answer]) > Math.abs(n - array[i + 1])) {
				answer = i + 1;
			}
		}
		System.out.println(array[answer]);
	}
}
