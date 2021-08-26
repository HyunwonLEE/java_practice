package practice_programmers;

import java.util.ArrayList;

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
		int[] answer = {};

		int index = 0;

		for (int i = 0; i < query.length; i++) {
			index++;
			ArrayList<String> list = new ArrayList<>();
			String[] arr = query[i].split(" ");
			for (int j = 0; j < arr.length; j++) {
				if (!arr[j].equals("and"))
					list.add(arr[j]);
			}
			String[] arr1 = query[i].split(" ");
			for (int j = 0; j < arr1.length; j++) {
				if (arr1[j].equals(list.get(j))) {

//				} else if (arr1[arr1.length - 1] > list.get(list.size() - 1)) {
//
//				}
			}

		}
		for (int i = 0; i < info.length; i++) {

			for (int j = 0; j < query.length; j++) {

			}
		}
		return answer;
	}
}