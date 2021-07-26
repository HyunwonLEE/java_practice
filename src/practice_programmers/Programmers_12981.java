package practice_programmers;

import java.util.HashSet;
import java.util.Set;

class Solution_12981 {
	public int[] solution(int n, String[] words) {
		int[] answer = new int[2];
		Set<String> set = new HashSet<String>();
		int a = 0;
		char c = 0;
		while (a < words.length) {
			answer[1]++;
			for (int j = 0; j < n; j++) {
				if (c > 0 && words[a].charAt(0) != c) {
					answer[0] = j + 1;
					return answer;
				}

				if (!set.add(words[a])) {
					answer[0] = j + 1;
					return answer;
				}
				c = words[a].charAt(words[a].length() - 1);
				a++;

			}
		}
		if (answer[0] == 0) {
			answer[0] = 0;
			answer[1] = 0;

		}

		return answer;
	}
}

public class Programmers_12981 {

	public static void main(String[] args) {
		int n = 3;
		String[] words = { "tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank" };
		Solution_12981 s = new Solution_12981();
		for (Integer i : s.solution(n, words)) {
			System.out.println(i);
		}

	}

}
