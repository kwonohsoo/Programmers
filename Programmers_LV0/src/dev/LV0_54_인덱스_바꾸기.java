package dev;

import java.util.Arrays;

public class LV0_54_인덱스_바꾸기 {

	public static void main(String[] args) {
		String my_string = "hello";
		int num1 = 1;
		int num2 = 2;
		String answer = "";

		String str[] = my_string.split("");

		String temp = str[num1];
		str[num1] = str[num2];
		str[num2] = temp;

		answer = String.join("", str);

		System.out.println(answer);

	}

}

// 