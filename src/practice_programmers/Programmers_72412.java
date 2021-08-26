package practice_programmers;

import java.util.ArrayList;
import java.util.HashMap;

public class Programmers_72412 {

	public static void main(String[] args) {
		String[] info = { "java backend junior pizza 150", "python frontend senior chicken 210",
				"python frontend senior chicken 150", "cpp backend senior pizza 260", "java backend junior chicken 80",
				"python backend senior chicken 50" };
		String[] query = { "java and backend and junior and pizza 100",
				"python and frontend and senior and chicken 200", "cpp and - and senior and pizza 250",
				"- and backend and senior and - 150", "- and - and - and chicken 100", "- and - and - and - 150" };

		Solution_72412 s = new Solution_72412();
		s.solution(info, query);
	}

}

class Solution_72412 {
	public int[] solution(String[] info, String[] query) {
		int[] answer = new int[query.length];
		HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();
		int index = 0;
		for (int i = 0; i < query.length; i++) {

			ArrayList<String> list = new ArrayList<>();
			String[] arr = query[i].split(" ");
			for (int j = 0; j < arr.length; j++) {
				if (!arr[j].equals("and"))
					list.add(arr[j]);
			}
			map.put(index++, list);

		}

		for (int i = 0; i < map.size(); i++) {
			ArrayList<String> list = map.get(i);
			
			for (int z = 0; z < info.length; z++) {
				int cnt = 0;
				String[] arr1 = info[z].split(" ");
				for (int j = 0; j < arr1.length-1; j++) {
					if (arr1[j].equals(list.get(j))) {
						cnt++;

					} else if (list.get(j).equals("-"))
						cnt++;
					else
						break;
				}
				if (list.get(list.size() -1).equals("-") || Integer.parseInt(arr1[arr1.length - 1]) >= Integer.parseInt(list.get(list.size() - 1)))
					cnt++;
				if (cnt == list.size()) {
					answer[i]++;					

				}
			}

		}

		return answer;
	}
}