package practice_programmers;
//해설 보고 풀었음


class Solution_42577 {
	public boolean solution(String[] phone_book) {

		for (String str : phone_book) {
			for(int i = 0; i < phone_book.length; i++) {
				if(str.startsWith(phone_book[i]) && !str.equals(phone_book[i])) return false;
			}
		}

		return true;
	}
}

/*
 * import java.util.ArrayList; import java.util.Collections; import
 * java.util.Comparator; import java.util.HashMap; import java.util.Iterator;
 * import java.util.List; import java.util.Map;
 * 
 * 
 * class Solution_42577 { public boolean solution(String[] phone_book) { boolean
 * answer = true; Map<Character, List<String>> map = new HashMap<Character,
 * List<String>>(); for (int i = 0; i < phone_book.length; i++) { if
 * (map.containsKey(phone_book[i].charAt(0))) {
 * map.get(phone_book[i].charAt(0)).add(phone_book[i]); } else {
 * map.put(phone_book[i].charAt(0), new ArrayList<String>());
 * map.get(phone_book[i].charAt(0)).add(phone_book[i]); }
 * 
 * }
 * 
 * // 문자열을 받아서 길이로 정렬하는 메서드 (내림차순) Comparator<String> c = new
 * Comparator<String>() { public int compare(String s1, String s2) { return
 * Integer.compare(s2.length(), s1.length()); } };
 * 
 * Iterator<Character> ir = map.keySet().iterator(); while (ir.hasNext()) {
 * Character key = ir.next(); Collections.sort(map.get(key), c); for (int j =
 * map.get(key).size()-1; j > 0; j--) { if (map.get(key).get(0).length() <=
 * map.get(key).get(j).length()) { j = map.get(key).size() -1;
 * map.get(key).remove(0); continue; } if
 * (map.get(key).get(0).startsWith(map.get(key).get(j))) return false; if(j ==
 * 1) { map.get(key).remove(0); j = map.get(key).size() -1; }
 * 
 * 
 * } } return answer; } }
 * 
 */
/*
 * import java.util.HashMap;
 * 
 * class Solution_42577 { public boolean solution(String[] phone_book) {
 * HashMap<String, Integer> hashMap = new HashMap<>();
 * 
 * for (String number : phone_book) hashMap.put(number, 0); for (String key :
 * hashMap.keySet()) for (int j = 1; j <= key.length() - 1; j++) if
 * (hashMap.containsKey(key.substring(0, j))) return false; return true; } }
 */
public class Programmers_42577 {

	public static void main(String[] args) {

		String[] phone_book = { "119", "97674223", "1195524421" };
		Solution_42577 s = new Solution_42577();
		System.out.println(s.solution(phone_book));
	}

}
