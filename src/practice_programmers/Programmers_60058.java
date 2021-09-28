package practice_programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Programmers_60058 {

	public static void main(String[] args) {
		Solution_60058 s = new Solution_60058();
		String p = "(()())()";
		System.out.println(s.solution(p));

	}

}

class Solution_60058 {
	public String solution(String p) {
		String answer = "";
		String[] arr = p.split("");
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
		int a = 0;
		for (int i = 0; i < list.size(); i++) {
			
 
		}
		return answer;
	}
}