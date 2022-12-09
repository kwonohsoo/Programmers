package dev;

import java.util.Arrays;

public class LV0_51_배열_회전시키기 {

	public static void main(String[] args) {
		int numbers[] = { 1, 2, 3 };
		String direction = "right";

		int[] answer = new int[numbers.length];

		if (direction.equals("right")) {
			for (int i = 0; i < numbers.length; i++) {
				if (i == numbers.length - 1) {
					answer[0] = numbers[numbers.length - 1];
				} else {
					answer[i + 1] = numbers[i];
				}
			}
		} else {
			for (int i = 0; i < numbers.length - 1; i++) {
				answer[i] = numbers[i + 1];
			}
			answer[numbers.length - 1] = numbers[0];
		}
		System.out.println(Arrays.toString(answer));
	}
}

// result [3, 1, 2]
// numbers 가 [1, 2, 3]이고 direction이 "right" 이므로 
// 오른쪽으로 한 칸씩 회전시킨 [3, 1, 2]를 return합니다.