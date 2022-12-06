package dev;

public class LV0_42_세균_증식 {

	public static void main(String[] args) {
		int n = 7;
		int t = 15;
		int answer = 0;

		answer = (int) (Math.pow(2, t) * n);
		System.out.println(answer);
	}
}
// 1시간에 두배 증식
// 처음 세균의 마리수 n
// 경과한 시간 t

// t시간 후 세균의 수

// 10시간 후  2048마리