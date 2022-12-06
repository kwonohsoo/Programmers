package dev;

public class LV0_46_가위_바위_보 {

	public static void main(String[] args) {
		String rsp = "2";
		String answer = "";

		char ch[] = rsp.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			switch (ch[i]) {
			case '2':
				answer += "0";
				break;
			case '0':
				answer += "5";
				break;
			case '5':
				answer += "2";
				break;
			}
			System.out.println(answer);
		}
	}
}

// 가위 2
// 바위 0
// 보 5
