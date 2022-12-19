package dev;

import java.util.Arrays;

public class LV0_73_잘라서_배열로_저장하기 {

	public static void main(String[] args) {
		String my_str = "abc1Addfggg4556b";
		int n = 6;

		String[] answer = my_str.split("(?<=\\G.{" + n + "})");

		System.out.println(Arrays.toString(answer));

//		"?<=|"    " |G."   

	}

}

// my_str을 n씩 잘라서 배열 만들기
// "abc1Addfggg4556b" -> ["abc1Ad", "dfggg4", "556b"]