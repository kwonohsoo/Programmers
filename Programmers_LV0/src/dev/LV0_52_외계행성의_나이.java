package dev;

public class LV0_52_외계행성의_나이 {

	public static void main(String[] args) {
		int age = 23;
		String answer = "";

		String str[] = Integer.toString(age).split("");

		for (int i = 0; i < str.length; i++) {
			answer += (char) (Integer.parseInt(str[i]) + 97);
		}
		System.out.println(answer);

	}

}
