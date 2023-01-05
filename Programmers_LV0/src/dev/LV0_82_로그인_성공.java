package dev;

public class LV0_82_로그인_성공 {

	public static void main(String[] args) {
		String[] id_pw = { "meosseugi", "1234" };
		String[][] db = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };
		String answer = "";

		for (int i = 0; i < db.length; i++) {
			if (db[i][0].equals(id_pw[0])) {
				if (db[i][1].equals(id_pw[1])) {
					answer = "login";
					continue;
				}

				answer = "wrong pw";
				continue;
			}

			answer = "fail";
			continue;
		}

		System.out.println(answer);

	}

}
