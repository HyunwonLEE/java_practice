package practice_programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//해설 보고 풀었음
class Solution_42577 {
	public boolean solution(String[] phone_book) {
		boolean answer = true;
		Map<Character, List<String>> map = new HashMap<Character, List<String>>();
		for (int i = 0; i < phone_book.length; i++) {
			if (map.containsKey(phone_book[i].charAt(0))) {
				map.get(phone_book[i].charAt(0)).add(phone_book[i]);
			} else {
				map.put(phone_book[i].charAt(0), new ArrayList<String>());
				map.get(phone_book[i].charAt(0)).add(phone_book[i]);
			}

		}
		for (int i = 0; i < phone_book.length; i++) {
			for (String str : map.get(phone_book[i].charAt(0))) {
				if (str.equals(phone_book[i]))
					continue;
				if (str.startsWith(phone_book[i]))
					return false;
			}
		}
		return answer;
	}
}

public class Programmers_42577 {

	public static void main(String[] args) {

		String[] phone_book = { "119", "97674223", "1195524421" };
		Solution_42577 s = new Solution_42577();
		System.out.println(s.solution(phone_book));
	}

}
