package dev;

import java.util.Iterator;

public class LV0_21_배열_원소의_길이 {

	public static void main(String[] args) {
		String strlist[] = { "We, are, the, world" };

		int answer[] = new int[strlist.length];

		for (int i = 0; i < strlist.length; i++) {
			answer[i] = strlist[i].length();
		}
		System.out.println(answer);

	}

}
