package dev;

public class LV0_47_주사위의_개수 {

	public static void main(String[] args) {
		int[] box = { 1, 1, 1 };
		int n = 1;
		int answer = 0;
		answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
		System.out.println(answer);
	}
}

// box[0] = 상자의 가로 길이
// box[1] = 상자의 세로 길이
// box[2] = 상자의 높이 길이

//	1 1 1 > 1 > 1
// 10 8 6 > 3 > 12