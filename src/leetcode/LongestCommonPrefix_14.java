package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix_14 {

	public static void main(String[] args) {
		String[] strs = {"a"};
		System.out.println(longestCommonPrefix(strs));
	}

	public static String longestCommonPrefix(String[] strs) {
		String answer = "";
		Arrays.sort(strs, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return Integer.compare(s2.length(), s1.length());
			}
		});
		
		for(int i = 0; i < strs[0].length(); i++) {
			String start = strs[0].substring(0, i+1);
			
			for(int j = 0; j < strs.length; j++) {
				if(!strs[j].startsWith(start)) {
					return answer;
				}
			}
			
			answer = start;
		}
		
		
		return answer;
	}

}
