package dev;

public class LV0_70_이진수_더하기 {

	public static void main(String[] args) {

		String bin1 = "10";
		String bin2 = "11";

		int b1 = Integer.parseInt(bin1, 2);
		int b2 = Integer.parseInt(bin2, 2);

		int binPlus = b1 + b2;

		String answer = Integer.toBinaryString(binPlus);

		System.out.println(answer);
	}

}
