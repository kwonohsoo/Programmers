package dev;

import java.util.Arrays;

public class LV0_64_2차원으로_만들기 {

	public static void main(String[] args) {
		int[] num_list = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int n = 2;
		int[][] answer = new int[num_list.length / n][n];

		for (int i = 0; i < num_list.length; i++) {
			answer[i / n][i % n] = num_list[i];
		}
		System.out.println(Arrays.toString(answer));

	}

}

// num_list가 [1, 2, 3, 4, 5, 6, 7, 8] 로 길이가 8이고 n이 2이므로 2 * 4 배열로 변경한 [[1, 2], [3, 4], [5, 6], [7, 8]] 을 return합니다.x`