package dev;

import java.util.Stack;

public class LV0_81_컨트롤_제트 {

	public static void main(String[] args) {
		String s = "1 2 Z 3";
		int answer = 0;

		String[] strArr = s.split(" ");
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < strArr.length; i++) {
			if (!strArr[i].equals("Z")) {
				stack.push(Integer.parseInt(strArr[i]));
			} else {
				if (stack.size() >= 1) {
					stack.pop();

				}

			}

		}
		while (stack.size() != 0) {
			answer += stack.pop();
		}
		System.out.println(answer);
	}

}
