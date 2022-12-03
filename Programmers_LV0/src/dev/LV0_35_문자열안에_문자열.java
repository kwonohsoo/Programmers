package dev;

public class LV0_35_문자열안에_문자열 {

	public static void main(String[] args) {
		int answer = 0;
		
		String str1 = "ab6CDE443fgh22iJKlmn1o";
		String str2 = "6CD";
		
		if (str1.contains(str2)) {
			answer = 1;
			
		} else {
			answer = 2;

		}
		System.out.println(answer);
		
		// contain() 함수는 대상 문자열에 특정 문자열이 포함되어 있는지 확인하는 함수
		//	true 또는 false 나옴
	}

}
