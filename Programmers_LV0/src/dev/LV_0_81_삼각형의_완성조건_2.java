package dev;

import java.util.Arrays;

public class LV_0_81_삼각형의_완성조건_2 {

	public static void main(String[] args) {
		int[] sides = { 1, 2 };
		int answer = 1;

		Arrays.sort(sides);

		int min = sides[0];
		int max = sides[1];

		for (int i = max - min + 1; i < max; i++) {
			answer++;
		}
		for (int i = max + 1; i < max + min; i++) {
			answer++;

		}
		System.out.println(answer);

	}

}
