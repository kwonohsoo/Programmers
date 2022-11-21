package dev;

public class LV0_08_각도기 {

	public static void main(String[] args) {
		
		int answer = 0;
		
		int angle = 70;
		
		if (angle < 90) {
			answer = 1;
		} else if(angle == 90){
			answer = 2;
		} else if (angle < 180) {
			answer = 3;
		} else if (angle == 180) {
			answer = 4;
		}
		System.out.println(answer);
	}

}
