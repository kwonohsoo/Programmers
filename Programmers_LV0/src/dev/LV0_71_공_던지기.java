package dev;

public class LV0_71_공_던지기 {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		int k = 5;
		int answer = 0;

		answer = numbers[2 * (k - 1) % numbers.length];

		System.out.println(answer);

	}

}

// 배열 numbers, 한 명 건너뛰고 k번째로 공던지는 사람 번호
//	[1, 2, 3 , 4]  k=2   -> answer = 3