package programmers_weekly;

import java.util.ArrayList;
import java.util.List;

public class Sixth_week {

	public static void main(String[] args) {

		Solution_85002 s = new Solution_85002();
		int[] weights = { 145, 92, 86 };
		String[] head2head = { "NLW", "WNL", "LWN" };
		for (int i : s.solution(weights, head2head)) {
			System.out.println(i);
		}

	}

}

class Solution_85002 {
	public int[] solution(int[] weights, String[] head2head) {
		int[] answer = new int[weights.length];
		int[] count = new int[weights.length];
		int[] weight_win = new int[weights.length];
		List<Double> list = new ArrayList<Double>();

		for (int i = 0; i < head2head.length; i++) {
			String[] arr = head2head[i].split("");
			for (int j = 0; j < arr.length; j++) {
				switch (arr[j]) {
				case "N": {
					break;
				}
				case "W": {
					count[i]++;
					if (weights[i] < weights[j])
						weight_win[i]++;
				}
				case "L": {
					break;
				}

				}
			}

			list.add((double) count[i] / weights.length);

		}

		for (int i = 0; i < list.size(); i++) {
			answer[i] = weights.length;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i) > list.get(j)) {
					answer[i]--;

				} else if (list.get(i).equals(list.get(j))) {

					if (weight_win[i] > weight_win[j]) {
						answer[i]--;

					} else if (weight_win[i] == weight_win[j]) {
						if (weights[i] > weights[j]) {
							answer[i]--;

						} else if (weights[i] == weights[j]) {
							if (i < j) {
								answer[i]--;
							}
						}
					}

				}

			}
		}

		return answer;
	}

}
