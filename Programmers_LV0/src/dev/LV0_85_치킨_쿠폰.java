package dev;

public class LV0_85_치킨_쿠폰 {

	public static void main(String[] args) {
		int chicken = 1081;
		int answer = 0;

		while (chicken >= 10) {
			answer += chicken / 10;
			int sChicken = chicken / 10;
			int lChicken = chicken % 10;
			chicken = sChicken + lChicken;

		}

		System.out.println(answer);

	}

}
