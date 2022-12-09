package dev;

import java.util.Arrays;

public class LV0_56_최댓값_만들기_2 {

	public static void main(String[] args) {
		int numbers[] = { 1, 2, -3, 4, -5 };
		int answer = 0;

		Arrays.sort(numbers);

		int num1 = numbers[0] * numbers[1];
		int num2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];

		if (num1 > num2) {
			answer = num1;
		} else {
			answer = num2;
		}
		System.out.println(answer);

	}

}
