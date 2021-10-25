package leetcode;



public class ReverseString_344 {

	public static void main(String[] args) {

		char[] s = { 'H','a','n','n','a','h' };
		reverseString(s);
	}

	public static void reverseString(char[] s) {
		
		char[] temp = s.clone();
		for(int i = 0; i < s.length; i++) {
			s[i] = temp[temp.length - i -1]; 
		}
			
		
		
		for (char c : s) {
			System.out.println(c);
		}
	}

}
