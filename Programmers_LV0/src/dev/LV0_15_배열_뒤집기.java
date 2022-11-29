package dev;

public class LV0_15_배열_뒤집기 {

	public static void main(String[] args) {
		int[] num_list = { 1, 2, 3, 4, 5 };
		int[] answer = new int[num_list.length];
		int count = 0;
		for (int i = num_list.length - 1; i >= 0; i--, count++) {
			answer[count] = num_list[i];
		}
		for (int i : answer) {
			System.out.print(i + " ");
		}

	}

}
