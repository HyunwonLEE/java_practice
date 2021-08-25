package practice_programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Programmers_42889 {

	public static void main(String[] args) {
		int N = 5;
		int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };
		Solution_42889 s = new Solution_42889();
		for (int i : s.solution(N, stages)) {
			System.out.println(i);
		}

	}

}

class Solution_42889 {
	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		int[] cnt = new int[N];
		HashMap<Integer, Double> map = new HashMap<>();
		for (int i = 0; i < stages.length; i++) {
			if (stages[i] < N + 1) {
				cnt[stages[i] - 1]++;
			}
		}
		int stages_length = stages.length;
		for (int i = 0; i < N; i++) {
			if (cnt[i] == 0)
				map.put(i + 1, 0.0d);
			else
				map.put(i + 1, (double) cnt[i] / stages_length);

			stages_length -= cnt[i];
		}
		List<Integer> list = new ArrayList<>(map.keySet());
		Collections.sort(list, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}