package dev;

public class LV0_37_옷가게_할인_받기 {

	public static void main(String[] args) {
		int price = 580000;
		int answer = 0;

		if (price >= 500000) {
			price *= 0.8;
		} else if (price >= 300000) {
			price *= 0.9;
		} else if (price >= 100000) {
			price *= 0.95;
		}
		answer = price;
		System.out.println(price);

	}

}

// 10만원 이상 5% 할인  150000  5% -> 150000 * 0.95 = 142500
// 30만원 이상 10% 할인
// 50만원 이상 20% 할인 580000  20% -> 580000 * 0.8 = 464000