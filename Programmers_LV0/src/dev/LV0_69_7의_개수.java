package dev;

import java.util.Arrays;

public class LV0_69_7의_개수 {

	public static void main(String[] args) {
		
		int[] array = {7, 77, 17};
		int answer = 0;
		
		StringBuilder sb = new StringBuilder();
		
//		for (int i = 0; i < array.length; i++) {
//			sb.append(array[i]);
//		}
//		String [] str = sb.toString().split("");
//		
//		for (int i = 0; i < str.length; i++) {
//			if (str[i].equals("7")) {
//				answer++;
//			}
//		}
//		System.out.println(answer);

		
		for (int i : array) {
			sb.append(i);
		}
//		System.out.println(sb);
		String [] str = sb.toString().split("");
		
		for (String s : str) {
//			System.out.println(s);
			if (s.equals("7")) {
				answer++;
			}	
		}
		System.out.println(answer);
			
		
	}

}
// 7의 개수