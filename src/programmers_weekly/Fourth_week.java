package programmers_weekly;

import java.util.Collections;
import java.util.TreeMap;

public class Fourth_week {

	public static void main(String[] args) {
		String[] table = { "SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
				"HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
				"GAME C++ C# JAVASCRIPT C JAVA" };
		String[] languages = { "PYTHON", "C++", "SQL" };
		int[] preference = { 7, 5, 5 };

		Solution_84325 s = new Solution_84325();
		System.out.println(s.solution(table, languages, preference));

	}

}

class Solution_84325 {
	public String solution(String[] table, String[] languages, int[] preference) {
		String answer = "";
		int[] result = new int[table.length];
		TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
		for (int i = 0; i < table.length; i++) {
			String[] table_detail = table[i].split(" ");
			for (int j = 1; j < table_detail.length; j++) {
				for (int z = 0; z < languages.length; z++) {
					if (languages[z].equals(table_detail[j])) {
						result[i] += preference[z] * (table_detail.length - j);
					}
				}

			}
			if (map.containsKey(result[i])) {
				if (map.get(result[i]).charAt(0) > table_detail[0].charAt(0)) {
					map.put(result[i], table_detail[0]);
				}
			} else {
				map.put(result[i], table_detail[0]);
			}

		}
		answer = map.get(map.firstKey());

		return answer;
	}
}