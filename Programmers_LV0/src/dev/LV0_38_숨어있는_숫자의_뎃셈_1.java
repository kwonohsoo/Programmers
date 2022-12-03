package dev;

import java.util.Arrays;

public class LV0_38_숨어있는_숫자의_뎃셈_1 {

	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
		int answer = 0;

		char[] ch = my_string.toCharArray();
		System.out.println(Arrays.toString(ch));

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 48 && ch[i] <= 57) {
//				System.out.println("i가 아닌 ch[i]를 비교해야합니당");
				answer += ch[i] - 48;
			}
		}
		System.out.println(answer);
	}

}
