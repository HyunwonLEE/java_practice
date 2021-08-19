package practice_programmers;

class Solution_42584 {
	public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				answer[i]++;
				if (prices[i] > prices[j]) {
					break;
				}
			}
		}

		return answer;
	}
}

public class Programmers_42584 {

	public static void main(String[] args) {
		int[] prices = { 1, 2, 3, 2, 3 };
		Solution_42584 s = new Solution_42584();
		for (int i : s.solution(prices)) {
			System.out.println(i);
		}

	}

}
