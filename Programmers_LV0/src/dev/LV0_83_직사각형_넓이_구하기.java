package dev;

public class LV0_83_직사각형_넓이_구하기 {

	public static void main(String[] args) {
		int[][] dots = { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } };
		int answer = 0;

		int maxX = dots[0][0];
		int minX = dots[0][0];
		int maxY = dots[0][1];
		int minY = dots[0][1];

		for (int i = 0; i < dots.length; i++) {
			maxX = Math.max(maxX, dots[i][0]);
			minX = Math.min(minX, dots[i][0]);
			maxY = Math.max(maxY, dots[i][1]);
			minY = Math.min(minY, dots[i][1]);

			answer = (maxX - minX) * (maxY - minY);

		}

		System.out.println(answer);

	}

}
