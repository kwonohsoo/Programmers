package dev;

public class LV0_79_외계어_사전 {

	public static void main(String[] args) {
		String[] spell = { "p", "o", "s" };
		String[] dic = { "sod", "eocd", "qixm", "adio", "soo" };
//		String[] spell = {"p", "o", "s"};
//		String[] dic = {"ppooss"};
        int answer = 2;
		for (int i = 0; i < dic.length; i++) {
			if (dic[i].length() == spell.length) {
				int count = 0;
				for (int j = 0; j < spell.length; j++) {
					if (dic[i].contains(spell[j])) {
						count++;
					}
					if (count == spell.length) {
						answer = 1;
                    }
				}
			}
		}        
		System.out.println(answer);
	}
}
