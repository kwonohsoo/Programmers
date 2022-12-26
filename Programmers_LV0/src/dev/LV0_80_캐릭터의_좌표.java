package dev;

import java.util.Arrays;

public class LV0_80_캐릭터의_좌표 {

	public static void main(String[] args) {
		String[] keyinput = { "left", "right", "up", "right", "right" };
		int[] board = { 11, 11 };
		int[] answer = { 0, 0 };

		int row = board[0];
		int column = board[1];

		for (int i = 0; i < keyinput.length; i++) {
			if (keyinput[i].equals("right") && answer[0] + 1 <= (row / 2)) {
				answer[0] = answer[0] + 1;
			} else if (keyinput[i].equals("left") && answer[0] - 1 >= -(row / 2)) {
				answer[0] = answer[0] - 1;

			} else if (keyinput[i].equals("up") && answer[1] + 1 <= (column / 2)) {
				answer[1] = answer[1] + 1;

			} else if (keyinput[i].equals("down") && answer[1] - 1 >= -(column / 2)) {
				answer[1] = answer[1] - 1;
			}
		}
		System.out.println(Arrays.toString(answer));
	}

}
