package dev;

import java.util.Arrays;

public class LV0_67_한_번만_등장한_문자 {

	public static void main(String[] args) {
		String s = "abcabcadc";
		String answer = "";
		int count = 0;

		String str[] = s.split("");
		Arrays.sort(str);

		for (int i = 0; i < str.length; i++) {
			count = 0;
			for (int j = 0; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					count++;
				}
			}
			if (count == 1) {
				answer += str[i];
			}
		}
		System.out.println(answer);
	}
}
