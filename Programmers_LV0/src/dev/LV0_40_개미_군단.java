package dev;

public class LV0_40_개미_군단 {

	public static void main(String[] args) {
		int hp = 23;
		int answer = 0;

		int a = hp / 5;
		int b = (hp % 5) / 3;
		int c = (hp % 5) % 1;

		answer = a + b + c;
		System.out.println(answer);

	}

}
//	a = 4  / b = 1 / c = 
// 장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력