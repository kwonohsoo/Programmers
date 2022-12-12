package dev;

public class LV0_62_팩토리얼 {

	public static void main(String[] args) {
		int n = 3628800;
		int answer = 0;
		int fac = 1;

		for (int i = 1; i <= n; i++) {
			fac *= i;
			if (fac == n) {
				answer = i;
				break;
			} else if (fac > n) {
				answer = i - 1;
				break;
			}
		}
		System.out.println(answer);
	}
}

// 10! = 3,628,800입니다. n이 3628800이므로 최대 팩토리얼인 10을 return 합니다.