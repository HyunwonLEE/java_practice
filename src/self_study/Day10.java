package self_study;

class Solution_10 {

	class TwoArray {
		int size;
		int start;
		int step;

		public TwoArray(int size, int start, int step) {
			this.size = size;
			this.start = start;
			this.step = step;
		}

		public int[][] createTwoArray() {
			int[][] ary = new int[size][size];
			int cnt = 0;

			for (int i = 0; i < size; i++) {
				if (i % 2 == 0) {
					for (int j = 0; j < size; j++) {
						ary[i][j] += (start + (step * cnt));
						cnt++;
					}
				} else {
					for (int j = size - 1; j >= 0; j--) {
						ary[i][j] += (start + (step * cnt));
						cnt++;
					}

				}

			}
			return ary;
		}

		public int sumTwoArray(int[][] ary) {
			int sumTA = 0;
			for (int i = 0; i < size; i++) {
				sumTA += ary[i][i];
			}
			return sumTA;
		}
	}

	public int solution(int size, int start, int step) {
		int answer = 0;
		TwoArray ta = new TwoArray(size, start, step);
		int[][] res = ta.createTwoArray();
		answer = ta.sumTwoArray(res);
		return answer;
	}

}

public class Day10 {

	public static void main(String[] args) {
		Solution_10 s = new Solution_10();

		int size = 2;
		int start = 1;
		int step = 1;
		int res = s.solution(size, start, step);
		System.out.println(res);

		size = 3;
		start = -5;
		step = -1;
		res = s.solution(size, start, step);
		System.out.println(res);

		size = 4;
		start = 1;
		step = 2;
		res = s.solution(size, start, step);
		System.out.println(res);

	}

}
