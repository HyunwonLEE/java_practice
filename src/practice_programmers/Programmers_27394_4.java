package practice_programmers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

class Solution_27394_4 {
	public String[] solution(String[] orders) {

		TreeMap<String, HashSet<String>> map = new TreeMap<>();		
		for (int i = 0; i < orders.length; i++) {
			String[] array = orders[i].split(" ");
			HashSet<String> set = new HashSet<String>();
			if (map.containsKey(array[0])) {
				set = map.get(array[0]);
			}

			for (int j = 1; j < array.length; j++) {
				set.add(array[j]);
			}
			map.put(array[0], set);
		}
		Iterator<String> it = map.keySet().iterator();
		TreeMap<String, Integer> map2 = new TreeMap<>();	
		int max = 0;
		while(it.hasNext()) {
			String str = it.next();
			map2.put(str, map.get(str).size());
			if (max < map.get(str).size()) max = map.get(str).size();
		}
		ArrayList<String> list = new ArrayList<String>();
		
		for(String key : map2.keySet()) {
			if(max == map2.get(key)) {
				list.add(key);
			}
		}
		
		String[] answer = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
			
		}
		
		
		
		return answer;
	}

}

public class Programmers_27394_4 {

	public static void main(String[] args) {
		String[] orders = { "alex pizza pasta", "alex pizza pizza", "alex noodle", "bob noodle sandwich pasta",
				"bob steak", "choi pizza sandwich pizza", "alex pizza pasta steak" };
		Solution_27394_4 s = new Solution_27394_4();
		for (String string : s.solution(orders)) {
			System.out.println(string);
		}

	}

}
