package dev;

public class LV0_23_중복된_숫자_개수 {

	public static void main(String[] args) {
		int array[] = { 1, 1, 2, 3, 4, 5 };
		int n = 1;
		int answer = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == n) {
				answer++;
			}
		}
		System.out.println(answer);
	}

}
