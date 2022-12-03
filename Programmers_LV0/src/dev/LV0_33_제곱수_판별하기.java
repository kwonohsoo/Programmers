package dev;

import java.util.Iterator;

public class LV0_33_제곱수_판별하기 {

	public static void main(String[] args) {
		int n = 144;
		int answer = 0;

		for (int i = 1; i < n; i++) {
			if (i * i == n) {
				answer = 1;
				break;
			} else {
				answer = 2;
			}
		}
		System.out.println(answer);

//		return (n&Math.sqrt(n) == 0) ? 1 : 2;
		
		
		/*
		 * if (Math.sqrt(n) == Math.sqrt(n)) { answer = 1; } if (Math.sqrt(n) !=
		 * Math.sqrt(n)) { answer= 2; } System.out.println(answer);
		 */
	}

}

//		Math.pow(answer, answer)
//		Math.sqrt(answer)