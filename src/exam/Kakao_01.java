package exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Kakao_01 {

	public static void main(String[] args) {

		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
		int k = 2;

		Solution_k1 s = new Solution_k1();
		s.solution(id_list, report, k);

	}

}

class Solution_k1 {
	public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];

		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		HashMap<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();
		HashMap<String, HashSet<String>> map1 = new HashMap<String, HashSet<String>>();

		for (int i = 0; i < report.length; i++) {
			String[] arr = report[i].split(" ");

			if (!map.containsKey(arr[0])) {
				map.put(arr[0], new HashSet<String>());
			}

			if (!map1.containsKey(arr[1])) {
				map1.put(arr[1], new HashSet<String>());
			}
			map.get(arr[0]).add(arr[1]);
			map1.get(arr[1]).add(arr[0]);

		}

		for (int i = 0; i < id_list.length; i++) {
			if (map.containsKey(id_list[i])) {
				Iterator<String> it = map.get(id_list[i]).iterator();
				while (it.hasNext()) {					
					if (map1.get(it.next()).size() >= k) {
						answer[i]++;
					}

				}

			} else {
				answer[i] = 0;
			}
		}
		//System.out.println(map);

		return answer;
	}
}