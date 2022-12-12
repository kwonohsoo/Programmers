package dev;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LV0_63_A로_B_만들기 {

	public static void main(String[] args) {
		String before = "olleh";
		String after = "hello";
		int answer = 0;

		char[] beforeCh = before.toCharArray();
		char[] afterCh = after.toCharArray();

		Arrays.sort(beforeCh);
		Arrays.sort(afterCh);

		if (Arrays.equals(afterCh, beforeCh)) {
			answer = 1;
		} else {
			answer = 0;
		}
		System.out.println(answer);
	}
}

//		for (int i = before.length() - 1; i >= 0; i--) {
//			str = str + before.charAt(i);
//			if (str.equals(after)) {
//				answer = 1;
//
//			} else {
//				answer = 0;
//			}
//		}