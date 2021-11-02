package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ValidParentheses_20 {
	static List<String> list = new ArrayList<String>();
	static String end = "";

	public static void main(String[] args) {
		String s = "(){}}{";
		System.out.println(isValid(s));
	}

	public static boolean isValid(String s) {
	
		boolean answer = true;

		String[] arr = s.split("");

		for (int i = 0; i < arr.length; i++) {
			if(!solution(arr[i]))
				return false;

		}
		if(list.size() > 0) return false;
		return answer;
	}

	public static boolean solution(String s) {

		if (s.equals("(")) {
			end = ")";
			list.add(s);
		} else if (s.equals("{")) {
			list.add(s);
			end = "}";

		} else if (s.equals("[")) {
			list.add(s);
			end = "]";

		} else if (s.equals(end)) {
			if(list.size() == 0) return false;
			list.remove(list.size() - 1);
			if(list.size() == 0) return true;
			if(list.get(list.size()-1).equals("(")) {
				end = ")";
			}else if(list.get(list.size()-1).equals("{")){
				end = "}";
			}else {
				end = "]";	
			}
			

		}else {
			return false;
		}
		return true;
		
	}

}
