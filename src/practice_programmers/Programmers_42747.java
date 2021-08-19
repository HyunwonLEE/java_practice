package practice_programmers;

import java.util.Arrays;

class Solution_42747 {
	public int solution(int[] citations) {
		int answer = 0;

		Arrays.sort(citations);
		for(int i = 0; i < citations.length; i++) {
			int h = citations.length - i;
			if(h <= citations[i]) {
				answer = h;
				break;
			}
		}
		return answer;
	}
}

public class Programmers_42747 {

	public static void main(String[] args) {
		Solution_42747 s = new Solution_42747();
		int[] citations = { 24,42 };
		System.out.println(s.solution(citations));

	}

}
