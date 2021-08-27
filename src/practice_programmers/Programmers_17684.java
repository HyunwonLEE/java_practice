package practice_programmers;

import java.util.ArrayList;
import java.util.TreeMap;

public class Programmers_17684 {

	public static void main(String[] args) {

		String msg = "ABABABABABABABAB";
		Solution_17684 s = new Solution_17684();

		for (int i : s.solution(msg)) {
			System.out.println(i);
		}
	}

}

class Solution_17684 {
	public TreeMap<String, Integer> map = new TreeMap<>();

	public int[] solution(String msg) {

		char az = 'A';
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 26; i++) {
			dictionary(String.valueOf(az++));
		}
		String[] arr = msg.split("");
		for (int i = 0; i < msg.length(); i++) {
			if (!dictionary(arr[i])) {
				
				for (int j = i + 1; j <= arr.length; j++) {
					if (!dictionary(msg.substring(i, j))) {
						if (j == arr.length) {
							list.add(map.get(msg.substring(i, j)));
							i += msg.substring(i, j).length() - 1;
						}							

					} else {
						list.add(map.get(msg.substring(i, j - 1)));
						if (msg.substring(i, j - 1).length() - 1 > 0)
							i += msg.substring(i, j - 1).length() - 1;
						break;

					}
				}

			} else {
				list.add(map.get(arr[i]));
				

			}

		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}

	
	public boolean dictionary(String str) {
		int index = map.size();
		if (!map.containsKey(str)) {
			map.put(str, ++index);
			return true;
		}

		return false;

	}
}


// 다른 사람 풀이
//class Solution {
//	  public int[] solution(String msg) {
//	    ArrayList<String> dic = new ArrayList<String>();
//	    ArrayList<Integer> result = new ArrayList<Integer>();
//
//	    for(int i = 0 ; i < 26; i++) {
//	        dic.add(String.valueOf((char)('A'+i)));
//	    }
//
//	    for(int i = 0 ; i < msg.length() ; i++) {
//	        for(int j = dic.size()-1 ; j >= 0 ; j--) {
//	            if(msg.substring(i).startsWith(dic.get(j))) {
//	                i += dic.get(j).length()-1;
//	                result.add(j+1);
//	                if(i+1 < msg.length())
//	                    dic.add(dic.get(j)+msg.charAt(i+1));
//	                break;
//	            }
//	        }
//	    }
//
//	    int[] answer = new int[result.size()];
//
//	    for(int i = 0 ; i < result.size() ; i++) 
//	        answer[i] = result.get(i);
//
//	    return answer;  
//	  }
//	}