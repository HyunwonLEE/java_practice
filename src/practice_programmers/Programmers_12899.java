package practice_programmers;

class Solution_12899 {
	public String solution(long n) {
		String answer = "";
		String[] numbers = { "1", "2", "4" };
		int a = (int) (n / 3);
		int b = (int) (n % 3);
		do {
			a = (int) (a / 3);
			if (a > 0)
				answer += numbers[a - 1];
			else
				answer += numbers[(int) (n - 1)];
		} while (a > 3);

		if (n > 3)
			answer += numbers[b - 1];
		return answer;
	}
}
//dj
public class Programmers_12899 {

	public static void main(String[] args) {
		Solution_12899 s = new Solution_12899();
		long n = 9;
		System.out.println(s.solution(n));

	}

}
