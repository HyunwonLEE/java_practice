package practice_programmers;

public class GCD_LCM {

	public static void main(String[] args) {

		Solution_G solution = new Solution_G();
		solution.solution(3, 12);
	}

}

class Solution_G {
	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		int result = 1;
		int multi = n * m;
		while (result != 0) {
			if (n > m) {
				result = n % m;
				n = m;
				m = result;
			} else {
				result = m % n;
				m = n;
				n = result;
			}
		}
		answer[0] = n > m ? n : m;
		answer[1] = n > m ? multi/n : multi/m;
		
 		return answer;
	}
}