package dev;

public class LV0_90_저주의_숫자_3 {

	public static void main(String[] args) {
		int n = 15;
		int answer = 0;

		for (int i = 0; i < n; i++) {
			answer++;
			while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
				answer++;
			}
		}
		System.out.println(answer);
	}

}