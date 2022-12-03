package dev;

public class LV0_30_짝수는_싫어요 {

	public static void main(String[] args) {
		int n = 10;
		int[] answer = new int[(n + 1) / 2];

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				answer[i / 2] = i;
			}
		}
	}

}

// 정수 n 매개변수
// n 이하의 홀수
// 오름차순으로 담긴 배열 return

//	1, 2, 3, 4, 5, 6, 7, 8, 9, 10
// int n [] = {1, 3, 5, 7, 9};