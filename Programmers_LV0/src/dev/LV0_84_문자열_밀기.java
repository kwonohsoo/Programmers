package dev;

public class LV0_84_문자열_밀기 {

	public static void main(String[] args) {
		String A = "hello";
		String B = "ohell";
		int answer = -1;

		for (int i = 0; i < A.length(); i++) {
			if (A.equals(B)) {
				answer = i;
			}
			A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1);
//			A = A.substring(0, A.length() - 1)+A.charAt(A.length() - 1);
			

		}
		System.out.println(answer);

	}

}
