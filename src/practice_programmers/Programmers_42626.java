package practice_programmers;

import java.util.PriorityQueue;

class Solution_42626 {

	public int solution(int[] scoville, int K) {
		int answer = 0;
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		int cnt = 0;
		for (int i : scoville) {
			if (i < K)
				cnt++;
			queue.add(i);

		}

		while (cnt > 0) {
			int peak = queue.poll();
			if (peak < K) {
				queue.add(peak + queue.poll() * 2);
				answer++;
			}
			cnt--;
		}

		if (queue.size() > 0 && queue.peek() > K)
			answer = -1;

		return answer;
	}
}

public class Programmers_42626 {

	public static void main(String[] args) {

		int[] scoville = { 10, 9, 7, 8, 10 };
		int k = 100;
		Solution_42626 s = new Solution_42626();
		// s.solution(scoville, k);
		System.out.println(s.solution(scoville, k));
	}

}
