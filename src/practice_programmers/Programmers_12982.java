package practice_programmers;

import java.util.Arrays;

public class Programmers_12982 {

	public static void main(String[] args) {

		int[] d = {1,3,2,5,4};
		int budget = 9;
		Solution_12982 soultion = new Solution_12982();
		soultion.solution(d, budget);
		
	}

}

class Solution_12982{
	public int solution(int[] d, int budget) {
		int answer = 0;
		int total = 0;
		Arrays.sort(d);
		for(int i =0; i < d.length; i++) {
			if(total + d[i] >= budget) {
				break;
			}else {
				total += d[i];
				answer++;
			}
		}
		
		return answer;
	}
}
