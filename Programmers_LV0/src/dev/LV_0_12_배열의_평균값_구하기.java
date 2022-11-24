package dev;

public class LV_0_12_배열의_평균값_구하기 {

	public static void main(String[] args) {
		double[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double answer = 0;
		double sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		answer = sum / numbers.length;	
		
		System.out.println(answer);
		
		// /////////////////////////////////////////////////////////////////////////
		
		double[] numbers2 = {89, 90, 91 ,92, 93, 94, 95, 96, 97, 98, 99};
		double answer2 = 0;
		double sum2 = 0;
		
		for (int i = 0; i < numbers2.length; i++) {
			sum2 += numbers2[i];
		}
		answer2 = sum2 / numbers2.length;
		
		System.out.println(answer2);
	}

}
