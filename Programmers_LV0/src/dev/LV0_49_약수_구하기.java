package dev;

import java.util.Arrays;
import java.util.Iterator;

public class LV0_49_약수_구하기 {

	public static void main(String[] args) {
		int n = 24;
		int index = 0;

		int array[] = new int[1000];

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				array[index] = i;
				index++;
			}
		}
		int answer[] = new int[index];

		for (int i = 0; i < index; i++) {
			if (array[i] != 0) {
				answer[i] = array[i];
			}
		}
		System.out.println(Arrays.toString(answer));
	}
}