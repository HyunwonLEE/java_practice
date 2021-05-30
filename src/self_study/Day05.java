package self_study;

import java.util.HashSet;


class Solution_05 {
	public int solution(int num) {
		int cnt = 0;
		String[] array = String.valueOf(num).split("");
		HashSet<String> set = new HashSet<String>();
		for(int i = 0; i < array.length; i++) {
			set.add(array[i]);
		}
		return cnt = set.size();
	}
}

public class Day05 {

	public static void main(String[] args) {

		Solution_05 s = new Solution_05();
		
		int data = 1;
		System.out.println(s.solution(data));

		data = 100000000;
		System.out.println(s.solution(data));

		data = 34915;
		System.out.println(s.solution(data));

		data = 5755647;
		System.out.println(s.solution(data));

		data = 740832;
		System.out.println(s.solution(data));
	}

}
