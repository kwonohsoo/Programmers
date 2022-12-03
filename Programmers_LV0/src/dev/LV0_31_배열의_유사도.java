package dev;

public class LV0_31_배열의_유사도 {

	public static void main(String[] args) {

		String[] s1 = { "a", "b", "c" };
		String[] s2 = { "com", "b", "c", "d", "p" };

		int answer = 0;

		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) {
					answer++;
				}
			}
		}
		System.out.println(answer);
	}

}
