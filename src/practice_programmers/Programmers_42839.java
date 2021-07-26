package practice_programmers;

import java.util.HashSet;

class Solution_42839 {
	public int solution(String numbers) {
		int answer = 0;
		char[] array = numbers.toCharArray();
		HashSet<Integer> set = new HashSet<>();
		for(int i = 1; i <= array.length; i++) {
			for(int j = 0; j < array.length; j++) {
			}
		}
		
		return answer;
	}
}

class Programmers_42839 {

	public static void main(String[] args) {

		Solution_42839 s = new Solution_42839();
		String numbers = "17";
		int answer = s.solution(numbers);
		System.out.println(answer);
	}

}
