package dev;

import java.util.Iterator;

public class LV0_27_문자_반복_출력하기 {

	public static void main(String[] args) {

		String my_string = "hello";
		int n = 3;
		String answer = "";
		char strA[] = my_string.toCharArray();

		for (int i = 0; i < strA.length; i++) {
			for (int j = 0; j < n; j++) {
				answer += strA[i];
			}
		}
		System.out.println(answer);

	}

}
