package exam;

import java.util.HashMap;
import java.util.Iterator;
//시간 초과
public class Kakao_06 {

	public static void main(String[] args) {
		int[][] board = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// int[][] board = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15
		// }, { 16, 17, 18, 19, 20 } };
		int[][] skill = { { 1, 1, 1, 2, 2, 4 }, { 1, 0, 0, 1, 1, 2 }, { 2, 2, 0, 2, 0, 100 } };

		int answer = solution(board, skill);
		System.out.println(answer);

	}

	public static int solution(int[][] board, int[][] skill) {
		int answer = 0;
		HashMap<String, Integer> map = new HashMap<String, Integer>();		
		
		for (int i = 0; i < skill.length; i++) {
			int cal = 1;

			if (skill[i][0] == 1) {
				cal = -1;
			}
			for (int x = skill[i][1]; x <= skill[i][3]; x++) {
				for (int y = skill[i][2]; y <= skill[i][4]; y++) {
					String str = x + "," + y;
					map.put(str, board[x][y] += cal * skill[i][5]);
				
				}
			}

		}
		
		
		int minus = 0;
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			if (map.get(key) <= 0) {
				minus++;
			}

		}
		answer = board.length * board[0].length - minus;
		return answer;
	}

}
