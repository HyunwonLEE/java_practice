package exam;

public class Naver_04 {

	public static void main(String[] args) {
		int[][] board = { { -10, 20, 30 }, { -10, 0, 10 }, { -20, 40, 1 } };
		solution(board);
	}

	public static int solution(int[][] board) {
		int answer = 0;
		int depart = board[0][0];
		int right = 0;
		int down = 0;
		int i = 0;
		int j = 0;
		while (i < board.length && j < board.length) {

			if (board[i][j + 1] == 0) {
				j++;
				if (depart < 0)
					depart *= -1;

			} else if (board[i + 1][j] == 0) {
				i++;
				if (depart < 0)
					depart *= -1;

			} else if (Math.abs(depart += board[i][j + 1]) > Math.abs(depart += board[i + 1][j])) {
				j++;
	

			} else if (Math.abs(depart += board[i][j + 1]) < Math.abs(depart += board[i + 1][j])) {
				i++;


			}

			depart += board[i][j];
		}

		System.out.println(depart);
		return answer;
	}
}
