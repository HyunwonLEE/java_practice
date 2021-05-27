package self_study;



class Solution{
	public int solution(int minDan, int maxDan) {
		int result = 0;
		int gu_dan = 19;
		if(minDan < 1) minDan = 1;
		if(maxDan > 19) maxDan = 19;
		for(int i = minDan; i <= maxDan; i++) {
			for(int j = 1; j <= gu_dan; j++ ) {
				if(i != j) result += (i * j);
						
			}
		}
		
		return result;
	}
}

public class Day02 {

	public static void main(String[] args) {
		Solution s = new Solution();
		int minDan, maxDan;
		int result;
		
		minDan = 1;
		maxDan = 3;
		result = s.solution(minDan, maxDan);
		System.out.println(result);
		
		minDan = 9;
		maxDan = 12;
		result = s.solution(minDan, maxDan);
		System.out.println(result);
		
		minDan = -2;
		maxDan = 4;
		result = s.solution(minDan, maxDan);
		System.out.println(result);

		
	}

}
