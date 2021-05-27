package practice_programmers;

class Solution_77884 {
	public int solution(int left, int right) {
		int answer = 0;

		for (int i = left; i < right + 1; i++) {
			int cnt = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					cnt++;

			}
			if (cnt % 2 == 0)
				answer += i;
			else
				answer -= i;
		}

		return answer;
	}
}

public class Programmers_77884 {

	public static void main(String[] args) {

		int left = 13;
		int right = 17;
		Solution_77884 s = new Solution_77884();
		int a = s.solution(left, right);
		System.out.println(a);

	}

}
