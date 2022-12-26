package dev;

import java.util.Iterator;

public class LV0_78_구슬을_나누는_경우의_수 {

	public static void main(String[] args) {
		int balls = 3;
		int share = 2;
		int answer = 1;

		for (int i = 0; i < share; i++) {
			answer *= (balls - i);
		}
		for (int i = 0; i < share; i++) {
			answer /= (share - i);
		}

		System.out.println(answer);

	}

}
