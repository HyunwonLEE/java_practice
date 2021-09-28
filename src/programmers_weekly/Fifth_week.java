package programmers_weekly;

public class Fifth_week {

	public static void main(String[] args) {
		String word = "AAAAA";
		Solution_84512 s = new Solution_84512();
		System.out.println(s.solution(word));

	}

}

class Solution_84512 {
	public int solution(String word) {
		int answer = 1;
		int word_length = word.length();
		word = word.replace("A", "1");
		word = word.replace("E", "2");
		word = word.replace("I", "3");
		word = word.replace("O", "4");
		word = word.replace("U", "5");
		double a = Double.valueOf(word) / Math.pow(10, word_length);
		double b = 0.1;
		
		while(a > b) {
			
		}
		


		return answer;
	}
}