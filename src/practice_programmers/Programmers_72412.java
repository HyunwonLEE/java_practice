package practice_programmers;

import java.util.Arrays;

public class Programmers_72412 {

	public static void main(String[] args) {
		String[] info = { 
				"java backend junior pizza 150",
				"python frontend senior chicken 210",
				"python frontend senior chicken 150",
				"cpp backend senior pizza 260",
				"java backend junior chicken 80",
				"python backend senior chicken 50" };
		String[] query = { 
				"java and backend and junior and pizza 150",
				"python and frontend and senior and chicken 200",
				"cpp and - and senior and pizza 250",
				"- and backend and senior and - 150",
				"- and - and - and chicken 100",
				"- and - and - and - 150" };

		Solution_72412 s = new Solution_72412();
		s.solution(info, query);
	}

}

//class Solution_72412 {
//	public int[] solution(String[] info, String[] query) {
//		int[] answer = new int[query.length];
//		HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();
//		int index = 0;
//		for (int i = 0; i < query.length; i++) {
//
//			ArrayList<String> list = new ArrayList<>();
//			String[] arr = query[i].split(" ");
//			for (int j = 0; j < arr.length; j++) {
//				if (!arr[j].equals("and"))
//					list.add(arr[j]);
//			}
//			map.put(index++, list);
//
//		}
//
//		for (int i = 0; i < map.size(); i++) {
//			ArrayList<String> list = map.get(i);
//			
//			for (int z = 0; z < info.length; z++) {
//				int cnt = 0;
//				String[] arr1 = info[z].split(" ");
//				for (int j = 0; j < arr1.length-1; j++) {
//					if (arr1[j].equals(list.get(j))) {
//						cnt++;
//
//					} else if (list.get(j).equals("-"))
//						cnt++;
//					else
//						break;
//				}
//				if (list.get(list.size() -1).equals("-") || Integer.parseInt(arr1[arr1.length - 1]) >= Integer.parseInt(list.get(list.size() - 1)))
//					cnt++;
//				if (cnt == list.size()) {
//					answer[i]++;					
//
//				}
//			}
//
//		}
//
//		return answer;
//	}
//}
class Solution_72412 {
	public int[] solution(String[] info, String[] query) {
		int[] answer = new int[query.length];
		
		Arrays.sort(info);

		
		for (int i = 0; i < query.length; i++) {
			
			String[] arr1 = query[i].replaceAll("\\s", "").split("and");

			for (int j = 0; j < info.length; j++) {
				int count = 0;
				String[] arr = info[j].split(" ");
				if (arr1[0].equals("-") || arr1[0].equals(arr[0])) {
					count++;
				}else continue;
				if (arr1[1].equals("-") ||arr1[1].equals(arr[1])) {
					count++;
				}else continue;
				if (arr1[2].equals("-") || arr1[2].equals(arr[2])) {
					count++;
				}else continue;
				if (arr1[3].startsWith("-")|| arr1[3].startsWith(arr[3])) {
					count++;
				}else continue;
				if(arr1[3].replaceAll("[^0-9]", "").isEmpty()) arr[3] = "0" ;
				if (Integer.parseInt(arr1[3].replaceAll("[^0-9]", "")) <= Integer.parseInt(arr[4])) {
					count++;
				}
				
				if(count == 5) {
					answer[i]++;
				}

			}

		}

		return answer;
		
	}
}