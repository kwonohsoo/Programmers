package dev;

public class LV0_18_피자_나눠_먹기3 {

	public static void main(String[] args) {
		int slice = 7;
		int n = 10;
		int answer = 0;	
		
		int result = n % slice;
		int pizza = n / slice;
		
		if (result == 0) {
			answer = pizza;
		} else {
			answer = pizza +1;
		}
		
		System.out.println(answer);
		

	}

}
