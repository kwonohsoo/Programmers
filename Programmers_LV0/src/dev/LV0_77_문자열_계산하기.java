package dev;

public class LV0_77_문자열_계산하기 {

	public static void main(String[] args) {
		String my_string = "3 + 4";
		
		String[] strArr = my_string.split(" ");
		int answer = Integer.parseInt(strArr[0]);

		for (int i = 1; i < strArr.length; i += 2) {
			if (strArr[i].equals("+")) {
				answer += Integer.parseInt(strArr[i + 1]);
			} else {
				answer -= Integer.parseInt(strArr[i + 1]);

			}
		}
		
		System.out.println(answer);
		
//		String my_string = "3 + 4";
//
//		String str1 = my_string.replace(" + ", " ");
//
//		System.out.println(str1);
//
//		String[] strArr1 = str1.split(" ");
//
//		System.out.println(Arrays.toString(strArr1));

	}

}
