package dev;

import java.util.Iterator;

public class LV0_34_자릿수_더하기 {

	public static void main(String[] args) {
		int answer = 0;
		int n = 1234;
		
		while (n>0) {
			answer += n%10;
			n /= 10;
		}
			System.out.println(answer);
		

	}

}

// 1234를 10으로 나누면 4가 나옴
// 4를 answer에 더해주고
// answer를 다시 10으로 나누면 1234 
// 반복
// n이 0으로 나올 때 더해요