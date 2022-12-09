package dev;

import java.util.Arrays;

public class LV0_57_문자열_정렬하기_2 {

	public static void main(String[] args) {
		String my_string = "Bcad";
		String answer = my_string.toLowerCase();
		char charArr[] = answer.toCharArray();
		Arrays.sort(charArr);
		answer = new String(charArr);

		System.out.println(answer);

	}

}
