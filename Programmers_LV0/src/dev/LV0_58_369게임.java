package dev;

public class LV0_58_369게임 {

	public static void main(String[] args) {
		int order = 29423;
		int answer = 0;

		String orderStr = Integer.toString(order);

		for (int i = 0; i < orderStr.length(); i++) {
			char orderCh = orderStr.charAt(i);

			if (orderCh == '3' || orderCh == '6' || orderCh == '9') {
				answer++;
			}

		}
		System.out.println(answer);

	}

}

// 3 6 9 -> 들어간 개수

// 3 ->1
// 29423 -> 2 