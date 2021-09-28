package practice_programmers;

import java.util.ArrayList;

public class Programmers_42583 {

	public static void main(String[] args) {

		Solution_42583 s = new Solution_42583();
		int bridge_length = 3;
		int weight = 3;
		int[] truck_weights = { 1, 2, 1 };
		System.out.println(s.solution(bridge_length, weight, truck_weights));
	}

}

class Solution_42583 {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		int cnt = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> queue = new ArrayList<Integer>();
		for (Integer integer : truck_weights) {
			list.add(integer);
		}
		int now_weight = 0;
		while (list.size() > 0) {
			for (int i = 0; i < bridge_length; i++) {
				if(list.size() <= 0) {
					break;
				}
				if (now_weight <= weight) {
					now_weight = list.remove(0);
					answer++;

				}
				if (list.size() > 0 && now_weight + list.get(0) <= weight) {
					now_weight += list.remove(0);
					answer++;
				}
				if (i == bridge_length) {
					now_weight -= queue.remove(0);
					if (queue.size() > 0) {
						i -= queue.size();
					} else {
						break;
					}
				}

			}

		}
		return answer;
	}
}