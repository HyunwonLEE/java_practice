package leetcode;


import java.util.HashSet;
import java.util.Set;

public class LongestSubstring_3 {

	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}

	public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        int n = s.length();
        int begin = 0, end = 0;
        int ans = 0;
 
        while(end < n) {
            if(set.contains(s.charAt(end))) {
                set.remove(s.charAt(begin++));
            } else {
                set.add(s.charAt(end++));
                ans = Math.max(ans, end - begin);
            }
        }
        return ans;
	}

}
