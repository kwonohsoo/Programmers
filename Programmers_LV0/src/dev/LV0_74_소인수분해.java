package dev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LV0_74_소인수분해 {

	public static void main(String[] args) {
		int n = 12;

		List<Integer> list = new ArrayList<>();

		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				n /= i;
				list.add(i);
			}
		}
		HashSet<Integer> ans = new HashSet<>();
		for (Integer i : list) {
			ans.add(i);

		}
		/////////////////////////////////////
		// ans int배열에 HashSet의 사이즈만큼 길이 지정
		int[] answer = new int[ans.size()];
		// Boxing된 arr배열로 HashSet 변환
		Integer[] arr = ans.toArray(new Integer[0]);
		// Boxing된 arr배열을 UnBoxing
		for (int i = 0; i < answer.length; i++)
			answer[i] = arr[i];

		Arrays.sort(answer);

		System.out.println(Arrays.toString(answer));
	}

}

// 12 = 2 * 2 * 3 -> 오름차순 배열 [2, 3]