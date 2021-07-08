package practice_programmers;

class Solution_27394 {

	public int[] solution(String[] students) {
		int[] answers = new int[students.length];
		int[] s_point = new int[students.length];
		for (int i = 0; i < students.length; i++) {
			s_point[i] = 10;
			int Lpoint = 0;
			int Ppoint = 0;
			char[] array = students[i].toCharArray();
			for (int j = 0; j < students[i].length(); j++) {
				if (array[j] == 'A') {
					s_point[i]++;
				} else if (array[j] == 'L') {
					Lpoint++;
					if (Lpoint == 2) {
						s_point[i]--;
						Lpoint = 0;
						Ppoint++;
					}
				} else if (array[j] == 'P') {
					s_point[i]--;
					Ppoint++;
				}
				if (Ppoint == 3) {
					s_point[i] = 0;
					break;
				}

			}
		}

		for (int i = 0; i < answers.length; i++) {
			int a = i + 1;
			int temp = s_point[i];
			if (temp != 20) {

				for (int j = 0; j < answers.length; j++) {
					if (temp < s_point[j]) {
						a = j + 1;
						temp = s_point[j];
					}

				}
			}
			s_point[a - 1] = -1;
			answers[i] = a;
		}

		return answers;
	}
}

public class Programmers_27394_1 {

	public static void main(String[] args) {

		// String[] students = { "AAAAAAAAAA", "AAALLLAPAA", "AAAAAAAPPP", "ALAAAAPAAA",
		// "ALAAAAPAAA", "AAAALLLLLL" };
		 String[] students = { "PPPAAAAAAA", "AAAAAAAAAA", "AAAAAAAAAA", "AAAAAAAAAA",
		 "AAAAAAAAAA", "AAAAAAAAAA" };
		//String[] students = { "PPPAAAAAAA" };
		Solution_27394 s = new Solution_27394();
		for (int i : s.solution(students)) {
			System.out.println(i);
		}

	}

}
