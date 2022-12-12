package dev;

public class LV0_65_k의_개수 {

	public static void main(String[] args) {
		int i = 1;
		int j = 13;
		int k = 1;
		int answer = 0;

		for (int n = i; n < j; n++) {
			int tmp = n;
			while (tmp != 0) {
				if (tmp % 10 == k)
					answer++;
				tmp /= 10;
			}
			System.out.println(answer);

		}

	}

}
