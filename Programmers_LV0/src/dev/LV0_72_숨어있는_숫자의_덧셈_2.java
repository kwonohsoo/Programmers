package dev;

import java.util.Arrays;

public class LV0_72_숨어있는_숫자의_덧셈_2 {

	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
		int answer = 0;

		String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

		for (String s : str) {
			if (!s.equals("")) {
				answer += Integer.parseInt(s);
			}
		}
		System.out.println(answer);

	}

}

// my_string 대문자, 소문자, 숫자 = 숫자의 합
// "aAb1B2cC34oOp" -> 1 + 2 + 34 = 37