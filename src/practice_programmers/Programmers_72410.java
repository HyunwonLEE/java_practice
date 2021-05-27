package practice_programmers;

// 정규식 표현 공부하기

public class Programmers_72410 {

	public static void main(String[] args) {
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		Solution_72401 solution = new Solution_72401();
		solution.solution(new_id);
	}

}

class Solution_72401{
	public String solution(String new_id) {
		String answer = "";
		new_id = new_id.toLowerCase().replaceAll("[^\\w-\\.]", "")
				                     .replaceAll("[\\.]{2,}", ".")
				                     .replaceAll("^\\.|\\.$", "");
		if(new_id.length() == 0) new_id = "a";
		if(new_id.length() > 15) new_id = new_id.substring(0,15).replaceAll("\\.$", "");
		if(new_id.length() <= 2) new_id += new String(new_id.charAt(new_id.length()-1) + "").repeat(3 - new_id.length());

		
		answer = new_id;

		System.out.println(answer);
		
		return answer;
	}
}
