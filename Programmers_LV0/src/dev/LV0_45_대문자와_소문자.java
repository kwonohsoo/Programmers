package dev;

import java.util.Arrays;
import java.util.Iterator;

public class LV0_45_대문자와_소문자 {

	public static void main(String[] args) {
		String my_string = "cccCCC";
		char[] ch = my_string.toCharArray();
		String answer = "";
		String a = "";

//		System.out.println(Arrays.toString(ch));
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) {
				a = ch[i] + "";
				answer += a.toLowerCase();

			} else if (ch[i] >= 97 && ch[i] <= 122) {
				a = ch[i] + "";
				answer += a.toUpperCase();
			}

		}
		System.out.println(answer);

	}

}

// 대문자 -> 소문자
// 소문자 <- 대문자