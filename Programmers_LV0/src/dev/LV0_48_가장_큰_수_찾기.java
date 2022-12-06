package dev;

import java.util.Arrays;
import java.util.Iterator;

public class LV0_48_가장_큰_수_찾기 {

	public static void main(String[] args) {

		int[] array = { 1, 8, 3 };
		int[] answer = new int[2];

		int max = array[0];
		int index = 0;

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
				index = i;
			}
		}
		answer[0] = max;
		answer[1] = index;
		System.out.println(Arrays.toString(answer));
	}

}
