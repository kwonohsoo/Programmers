package dev;

public class LV0_24_배열_두_배_만들기 {

	public static void main(String[] args) {
		int numbers[] = { 1, 2, 3, 4, 5 };
		int answer[] = new int[numbers.length];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = numbers[i] * 2;
		}
		System.out.println(answer);
	}

}
