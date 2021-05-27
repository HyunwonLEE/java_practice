package practice_programmers;

import java.util.ArrayList;

public class Borrow_Clothes {

	public static void main(String[] args) {

		Solution_4 solution = new Solution_4();
		int[] lost = { 2, 4 };
		int[] reserve = { 1, 3, 5 };
		solution.solution(5, lost, reserve);
	}

}

class Solution_4 {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		for (int i = 0; i < lost.length; i++) {
			arrayList.add(lost[i]);

		}
		for (int i = 0; i < reserve.length; i++) {
			if (arrayList.remove((Object) reserve[i])) {
				reserve[i] = 0;
			}
		}

		for (int i = 0; i < arrayList.size(); i++) {

			for (int j = 0; j < reserve.length; j++) {
				if (reserve[j] != 0) {
					if (arrayList.get(i) + 1 == reserve[j]) {
						arrayList.remove(i);
						reserve[j] = 0;
						i--;
						break;
					} else if (arrayList.get(i) - 1 == reserve[j]) {
						arrayList.remove(i);
						reserve[j] = 0;
						i--;
						break;
					}

				}
			}

		}

		answer = n - arrayList.size();
		return answer;
	}
}