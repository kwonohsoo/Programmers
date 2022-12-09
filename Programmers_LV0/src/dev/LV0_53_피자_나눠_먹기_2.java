package dev;

public class LV0_53_피자_나눠_먹기_2 {

	public static void main(String[] args) {
		int n = 6;
		int answer = 0;
		int pizza = 0;

		for (int i = 1; i <= n && i <= 6; i++) {
			if (n % i == 0 && 6 % i == 0) {
				pizza = i;
			}
			answer = n * 6 / pizza / 6;
		}
		System.out.println(answer);
	}
}