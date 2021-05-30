package self_study;

class Solution_06 {
	public int solution(int n, int[] votes) {
		int answer = 0;
		int[] cnt = new int[n+1];
		for(int i =0; i < votes.length; i++) {
			cnt[votes[i]]++;			
		}
		int max = cnt[0];
		for(int i = 1; i < cnt.length; i++) {
			if(max < cnt[i]) {
				max = cnt[i];
				answer = i;
			}else if(max == cnt[i]) answer = -1;
		}
		
		if(answer > 0 && cnt[answer] < votes.length / 2) answer = -1; 
		
		return answer;
	}
}

public class Day06 {

	public static void main(String[] args) {

		Solution_06 sol = new Solution_06();

		int n1 = 3;
		int[] votes1 = { 1, 2, 1, 3, 1, 2, 1 };
		int res1 = sol.solution(n1, votes1);
		System.out.println(res1);

		int n2 = 2;
		int[] votes2 = { 2, 1, 2, 1, 2, 2, 1 };
		int res2 = sol.solution(n2, votes2);
		System.out.println(res2);

		int n3 = 3;
		int[] votes3 = { 2, 3, 2, 1, 1, 2, 3, 3, 1, 2, 1 };
		int res3 = sol.solution(n3, votes3);
		System.out.println(res3);

	}

}
