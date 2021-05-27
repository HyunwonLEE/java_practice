package practice_programmers;

class Solution_76501 {
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		for(int i = 0; i < signs.length; i++) {
			if(signs[i]) {
				answer += absolutes[i];
			}else {
				answer -= absolutes[i];
			}
		}
		return answer;
	}
}

public class Programmers_76501 {

	public static void main(String[] args) {

		int[] absolutes = { 4, 7, 12 };
		boolean[] sighs = { true, false, true };
	

		Solution_76501 solution = new Solution_76501();
		int a = solution.solution(absolutes, sighs);
		System.out.println(a);

	}

}
