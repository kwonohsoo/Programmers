package dev;

import java.util.Arrays;

public class LV0_22_최댓값_만들기_1 {

	public static void main(String[] args) {
		int numbers[] = { 1, 2, 3, 4, 5 };
		Arrays.sort(numbers);

		int answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];

		System.out.println(answer);

	}

}
