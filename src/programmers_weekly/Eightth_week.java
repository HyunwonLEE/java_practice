package programmers_weekly;

public class Eightth_week {

	public static void main(String[] args) {

		int[][] sizes = { { 10, 7 }, { 12, 3 }, { 8, 15 }, { 14, 7 }, { 5, 15 } };

		solution(sizes);

	}

	public static int solution(int[][] sizes) {
		int answer = 0;

		int max = 0;
		int max_wh = 0;
		int max_index = 0;

		for (int i = 1; i < sizes.length; i++) {
			if (max < sizes[i][0]) {
				max = sizes[i][0];
				max_wh = 0;
				max_index = i;
				
			}
			if (max < sizes[i][1]) {
				max = sizes[i][1];
				max_wh = 1;
				max_index = i;
			}

		}

		for (int i = 0; i < sizes.length; i++) {
			

		}

		return answer;
	}

}
