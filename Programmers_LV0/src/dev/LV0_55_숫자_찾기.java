package dev;

public class LV0_55_숫자_찾기 {

	public static void main(String[] args) {
		int num = 29183;
		int k = 1;
		int answer = 0;

		String numS = Integer.toString(num);
		String kS = Integer.toString(k);

		if (numS.indexOf(kS) == -1) {
			answer = -1;
		} else {
			answer = numS.indexOf(kS) + 1;

			System.out.println(answer);
		}

	}

}
