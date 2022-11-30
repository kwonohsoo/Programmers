package dev;

import java.util.Arrays;

public class LV0_29_삼각형의_완성조건_1 {

	public static void main(String[] args) {
		int sides[] = { 1, 2, 3 };
		int answer = 0;

		Arrays.sort(sides);

		if (sides[2] < sides[0] + sides[1]) {
			answer = 1;
		} else {
			answer = 2;
		}
		System.out.println(answer);

	}

}

// true = 1   false = 2
