package dev;

public class LV0_10_짝수의_합 {

	public static void main(String[] args) {
		int n = 10;
		int sum = 0;
		
		for (int i = 2; i <= n; i+=2) {
			sum+= i;
		}
		System.out.println(sum);	
	}
}