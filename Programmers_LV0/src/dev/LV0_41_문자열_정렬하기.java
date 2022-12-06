package dev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class LV0_41_문자열_정렬하기 {

	public static void main(String[] args) {
		String my_string = "hi12392";
		// int[] answer = {};

		my_string = my_string.replaceAll("[^0-9]", "");
		String str[] = my_string.split("");
		int[] answer = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			answer[i] = Integer.parseInt(str[i]);

		}
		Arrays.sort(answer);
		System.out.println(Arrays.toString(answer));

	}

}

// 1 2 2 3 9 2
/*
 * char ch[] = my_string.toCharArray(); Arrays.sort(ch);
 * 
 * for (int i = 0; i < ch.length; i++) { int chh = (int) ch[i] - 48;
 * System.out.println(chh); if (chh < 10) { System.out.println(chh); }
 * 
 * }
 */