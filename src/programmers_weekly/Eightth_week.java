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

		for (int i = 0; i < sizes.length; i++) {
			if (max < sizes[i][0]) {
				max = sizes[i][0];
				max_wh = 1;
				max_index = i;
				
			}
			if (max < sizes[i][1]) {
				max = sizes[i][1];
				max_wh = 0;
				max_index = i;
			}

		}
		
		int temp = sizes[max_index][max_wh];
		for (int i = 0; i < sizes.length; i++) {
			
			if(sizes[i][0] < sizes[i][1]) {
				if(temp < sizes[i][0]) {
					temp = sizes[i][0];
				}
			}else {
				if(temp < sizes[i][1]) {
					temp = sizes[i][1];
				}
			}

		}
		answer = temp*max;
		System.out.println(temp + " * " + max + " = " + answer);

		return answer;
	}

}
