package dev;

public class LV_0_13_머쓱이보다_키_큰_사람 {

	public static void main(String[] args) {
		int[] array = {149, 180, 192, 170};
		int height = 167;
		int answer = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i]>height) {
				answer ++;
			}
		}
		System.out.println(answer);
		
		
		int[] array2 = {180, 120, 140};
		int height2 = 190;
		int answer2 = 0;
		
		for (int i = 0; i < array2.length; i++) {
			if (array2[i]>height2) {
				answer2 ++;
			}
		}
		System.out.println(answer2);
	}

}
