package dev;

import java.util.Arrays;

public class LV0_68_진료_순서_정하기 {

	public static void main(String[] args) {
		int[] emergency = { 3, 76, 24 };
		int[] answer = new int[emergency.length];

		for (int i = 0; i < emergency.length; i++) {
			for (int j = 0; j < answer.length; j++) {
				if (emergency[i] < emergency[j] || emergency[i]==emergency[j]) {
					answer[i] = answer[i] + 1;
				}
			}
		}
		System.out.println(Arrays.toString(answer));
	}
}
