package dev;

public class LV0_60_중복된_문자_제거 {

	public static void main(String[] args) {
		String my_string = "people";
		String answer = "";

		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.indexOf(my_string.charAt(i)) == i) {
				answer += my_string.charAt(i);
			}
		}
		System.out.println(answer);
	}
}

// my_string에서 중복된 문자를 제거
// 하나의 문자만 남긴 문자열 return
// people -> 중복된 p, e 제거 -> poel return