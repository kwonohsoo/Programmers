package dev;

public class LV0_17_배열_자르기 {

	public static void main(String[] args) {
		
		int numbers [] = {1, 3, 5};
		int num1 = 1;
		int num2 = 2;
		
		int count =0;
		int answer[] = new int[num2-num1+1];
		//answer = {2,3,null};
		for (int i = num1; i <= num2; i++,count++) answer[count] = numbers[i];
		
		//출력문
		for(int ans : answer)System.out.printf(ans + " ");
	}

}
//다시풀기