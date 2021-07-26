package practice_programmers;

class Solution_12985 {
//	public int solution(int n, int a, int b) {
//		int answer = (int) baseLog(n, 2);
//		while (n > 2) {
//			n /= 2;
//
//			if((n >= a && n < b) || (n < a && n >= b)) return answer;
//			answer--;
//		}
//
//		return answer;
//	}
//
//	static double baseLog(double x, double base) {
//		return Math.log10(x) / Math.log10(base);
//	}

	public int solution(int n, int a, int b) {
		int answer = 0;

		while (a != b) {
			answer++;
			a = (a + 1) / 2;
			b = (b + 1) / 2;
		}

		return answer;
	}

}

public class Programmers_12985 {

	public static void main(String[] args) {
		Solution_12985 s = new Solution_12985();
		int n = 8;
		int a = 2;
		int b = 3;
		System.out.println(s.solution(n, a, b));

	}

}
