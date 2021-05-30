package self_study;


class Solution_04{
	public String solution(String s, int n) {
		String answer = "";
		String[] array = s.split("");
		
		for(int i = 0; i < s.length(); i++) {
			char a = array[i].charAt(0);;
			for(int j = 0; j < n; j++) {
				if(array[i].equals(" ")) break;	
				if(array[i].equals("z")) array[i] = "a";
				else if(array[i].equals("Z")) array[i] = "A";				
				else a++;				
			}
			answer += String.valueOf(a);
		}
		return answer;
	}
}


public class Day04 {

	public static void main(String[] args) {

		
		Solution_04 s = new Solution_04();
		String data = "Hello";
		int n = 3;
		String res = s.solution(data, n);
		System.out.println(res);
		
		data = "caeser";
		n = 4;
		res = s.solution(data, n);
		System.out.println(res);
		
		data = "Caeser Cipher";
		n = 4;
		res = s.solution(data, n);
		System.out.println(res);
	}

}
