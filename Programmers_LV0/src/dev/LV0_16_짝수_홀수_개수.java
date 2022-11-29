package dev;

public class LV0_16_짝수_홀수_개수 {

	public static void main(String[] args) {

		int[] num = {1, 2, 3, 4, 5};
		
		int n1 = 0;
		int n2 = 0;
		
		int answer = 0;
		
		for (int i = 0; i < num.length; i++) {
			if (num[i]%2 == 0) {
				n1++;
			} else {
				n2++;
			}
		}
		System.out.println(n1);
		System.out.println(n2);
		
	}

}
