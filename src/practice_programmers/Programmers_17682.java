package practice_programmers;

public class Programmers_17682 {

	public static void main(String[] args) {
		String dartResult = "1S2D*3T10S";
		Solution_17682 s = new Solution_17682();
		System.out.println(s.solution(dartResult));

	}

}

class Solution_17682 {
	public int solution(String dartResult) {
		int answer = 0;
		String[] array_point = dartResult.split("[SDT]");
		String[] array_bonus = dartResult.split();
		int point = -1;
		for (int i = 0; i < dartResult.length(); i++) {

		}
		return answer;
	}
}