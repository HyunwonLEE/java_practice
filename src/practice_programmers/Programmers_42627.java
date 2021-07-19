package practice_programmers;

import java.util.TreeMap;

class Solution_42627 {
	public int solution(int[][] jobs) {
		int answer = 0;
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		for(int i = 0; i < jobs.length; i++) {
			map.put(jobs[i][0], jobs[i][1]);
		}
		for()
		
		return answer;
	}
}

public class Programmers_42627 {

	public static void main(String[] args) {
		Solution_42627 s = new Solution_42627();

		int[][] jobs = { { 0, 3 }, { 1, 9 }, { 2, 6 } };
		System.out.println(s.solution(jobs));

	}

}
