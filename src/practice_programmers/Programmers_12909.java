package practice_programmers;

//import java.util.Stack;
//
//class Solution {
//    boolean solution(String s) {
//        boolean answer = true;
//        int counter = 0;
//        
//        Stack<Character> st = new Stack<>();
//        
//        for(int i = 0; i<s.length(); i++) {
//        	if(s.charAt(i) == '(') {
//        		st.add(s.charAt(i));
//        	} else {        		
//        		if (st.size() > 0){
//        			st.pop();
//        		}else{
//        			answer = false;
//        			break;
//        		}        		
//        	}
//        }
//        
//        if (st.size() != 0)
//        	answer = false;  
//        		
//        return answer;
//    }
//}

class Solution_12909 {
	boolean solution(String s) {
		boolean answer = true;
		char[] array = s.toCharArray();
		if (array[0] == ')' || array[array.length - 1] == '(')
			return false;
		int a = 0;
		for (int i = 0; i < s.length(); i++) {
			if (array[i] == '(')
				a++;
			else {
				 if(a == 0) return false;
				a--;
			}

		}

		if (a != 0)
			return false;

		return answer;
	}
}

public class Programmers_12909 {

	public static void main(String[] args) {
		String s = "(()()))(()";
		Solution_12909 s1 = new Solution_12909();
		System.out.println(s1.solution(s));

	}

}
