package programmers_weekly;

class Solution_83201 {
	public String solution(int[][] scores) {
		String answer = "";

		for (int i = 0; i < scores.length; i++) {
			int min_dup = 0;
			int max_dup = 0;
			int student_cnt = scores.length;
			int self_point = scores[i][i];
			int max = scores[0][i];
			int min = scores[0][i];
			double sum = scores[0][i];
			for (int j = 1; j < scores[i].length; j++) {
				if (max == scores[j][i]) {
					max_dup++;
				} else if (min == scores[j][i]) {
					min_dup++;
				}

				if (max < scores[j][i]) {
					max = scores[j][i];
					max_dup = 0;
				}

				if (min > scores[j][i]) {
					min = scores[j][i];
					min_dup = 0;

				}
				sum += scores[j][i];
			}

			if ((max == self_point && max_dup < 1) || (min == self_point && min_dup < 1)) {
				sum -= self_point;
				student_cnt--;
			}

			if (sum / student_cnt >= 90) {
				answer += "A";
				continue;
			} else if (sum / student_cnt >= 80) {
				answer += "B";
				continue;
			} else if (sum / student_cnt >= 70) {
				answer += "C";
				continue;
			} else if (sum / student_cnt >= 50) {
				answer += "D";
				continue;
			} else {
				answer += "F";
				continue;

			}
		}
		return answer;
	}
}

public class Second_week {

	public static void main(String[] args) {

		int[][] scores = { { 100, 90, 98, 88, 65 }, { 50, 45, 99, 85, 77 }, { 47, 88, 95, 80, 67 },
				{ 61, 57, 100, 80, 65 }, { 24, 90, 94, 75, 65 } };
		Solution_83201 s = new Solution_83201();
		System.out.println(s.solution(scores));
	}

}
