package practice_programmers;

import java.util.LinkedHashMap;
import java.util.HashSet;

class Solution_27394_4{
	public String[] solution(String[] orders) {
		String[] answers = {};
		LinkedHashMap<String, HashSet<String>> map = new LinkedHashMap<>();
		
		
		for(int i = 0; i < orders.length; i++) {
			String[] array = orders[i].split(" ");
			HashSet<String> set = new HashSet<>();
			for(int j = 1; j < array.length; j++) {
				set.add(array[j]);
			}
			map.put(array[0], set);
		}

		for(int i = 0; i < map.size(); i++) {
			System.out.println(map.values());
		}
		
		return answers;
	}
}

public class Programmers_27394_4 {

	public static void main(String[] args) {
		String[] orders = {"alex pizza pasta steak", "bob noodle sandwich pasta", "choi pizza sandwich pizza", "alex pizza pasta steak"};
		Solution_27394_4 s = new Solution_27394_4();
		for (String string : s.solution(orders)) {
			System.out.println(string);
		}

	}

}
