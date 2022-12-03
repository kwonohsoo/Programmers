package dev;

import java.util.Iterator;

public class LV0_39_모음_제거 {

	public static void main(String[] args) {
		String my_string = "nice to meet you";
		String answer = "";

//		String str[] = { "a", "e", "i", "o", "u" };
		

	        answer = my_string.replaceAll("[aeiou]", "");

//
//		for (int i = 0; i < str.length; i++) {
//			if (my_string.contains(str[i])) {
//				answer = my_string.replaceAll(str[i], "");
//				my_string = answer;
//
////			}else {
////				answer = my_string;
//			}
//			
//		}
		System.out.println(answer);

	}

}

//a, e, i, o, u 를 제거한 문자열 return
//Bus -> bs