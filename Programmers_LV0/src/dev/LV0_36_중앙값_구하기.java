package dev;

import java.util.Arrays;

public class LV0_36_중앙값_구하기 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 7, 10, 11 };
		int answer = 0;

		Arrays.sort(array);

		answer = array[array.length / 2];

		System.out.println(answer);

	}

}
