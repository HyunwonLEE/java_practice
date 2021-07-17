package practice_programmers;

class Solution_42626 {
	public int solution(int[] scoville, int K) {
		int answer = 0;
		for (int i = 1; i < scoville.length; i++) {
			int c = i;
			do {
				int root = (c - 1) / 2;
				if (scoville[root] < scoville[c]) {
					int temp = scoville[root];
					scoville[root] = scoville[c];
					scoville[c] = temp;
				}
				c = root;
			} while (c != 0);
		}
		for (int i = scoville.length - 1; i >= 0; i--) {
			int temp = scoville[0];
			scoville[0] = scoville[i];
			scoville[i] = temp;
			int root = 0;
			int c = 1;
			do {
				c = 2 * root + 1;
				if (c < i - 1 && scoville[c] < scoville[c + 1]) {
					c++;
				}
				if( c < i  && scoville[root] < scoville[c]) {
					temp = scoville[root];
					scoville[root] = scoville[c];
					scoville[c] = temp;
				}
				root = c;
			} while (c < i);
		}

		for (int i : scoville) {
			System.out.println(i);
		}

		return answer;
	}
}

public class Programmers_42626 {

	public static void main(String[] args) {

		int[] scoville = { 1, 2, 3, 9, 10, 12, 8 };
		int k = 7;
		Solution_42626 s = new Solution_42626();
		s.solution(scoville, k);
		// System.out.println(s.solution(scoville, k));
	}

}
