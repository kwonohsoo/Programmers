package dev;

import java.util.HashMap;

public class LV0_61_모스부호_1 {

	public static void main(String[] args) {
		String letter = ".... . .-.. .-.. ---";
		String answer = "";

		String str[] = letter.split(" ");
		String morse[] = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
				".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
				"--.." };

		HashMap<String, Character> morseMap = new HashMap<>();

		for (int i = 0; i < morse.length; i++) {
			morseMap.put(morse[i], (char) (97 + i));
		}

		StringBuilder sb = new StringBuilder();
		for (String string : str) {
			sb.append(morseMap.get(string));
		}
		answer = sb.toString();
	}

}
