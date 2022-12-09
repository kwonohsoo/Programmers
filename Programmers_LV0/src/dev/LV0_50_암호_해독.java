package dev;

import java.util.Arrays;

public class LV0_50_암호_해독 {

	public static void main(String[] args) {
		String cipher = "dfjardstddetckdaccccdegk";
		int code = 4;
		String answer = "";

		char[] str = cipher.toCharArray();

		System.out.println(Arrays.toString(str));

		for (int i = code - 1; i < str.length; i += code) {
			answer += str[i];
		}
		System.out.println(answer);
	}
}

// "dfjardstddetckdaccccdegk" 의 
// 4번째, 8번째, 12번째, 16번째, 20번째, 24번째 글자를 
// 합친 "attack"을 return합니다.