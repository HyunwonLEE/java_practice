package practice_programmers;

class Solution_12495 {
	public int solution(int n) {
		int answer = 0;
		int result = 0;
		int first = 0;
		int second = 1;
		for(int i = 0; i < n; i++) {
			result = (first + second)%1234567;
			first = second%1234567;
			second = result%1234567;
		}
		answer = first;
		return answer;
	}
}

public class Programmers_12495 {

	public static void main(String[] args) {
		int n = 3;
		Solution_12495 s = new Solution_12495();
		System.out.println(s.solution(n));

	}

}
