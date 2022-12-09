package dev;

import java.util.ArrayList;
import java.util.Arrays;

public class LV0_44_n의_배수_고르기 {

	public static void main(String[] args) {
		int n = 3;
		int[] numlist = { 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int[] num = new int[numlist.length];
		int count = 0;

		for (int i = 0; i < numlist.length; i++) {
			if (numlist[i] % n == 0) {
				num[count] = numlist[i];
				count++;
			}
		}
		int[] answer = new int[count];
		for (int i = 0; i < count; i++) {
			answer[i] = num[i];
		}
		System.out.println(Arrays.toString(answer));
	}
}
