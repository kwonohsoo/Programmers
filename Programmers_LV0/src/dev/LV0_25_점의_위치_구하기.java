package dev;

public class LV0_25_점의_위치_구하기 {

	public static void main(String[] args) {
		int dot [] = {2, 4};
		int answer = 0;
		if (dot[0]>0 && dot[1]>0) {
			answer = 1;
		} else if (dot[0]<0 && dot[1]>0) {
			answer = 2;
		} else if (dot[0]<0 && dot[1]<0) {
			answer = 3;
		}else {
			answer = 4;
		}
		
		System.out.println(answer);

	}

}
