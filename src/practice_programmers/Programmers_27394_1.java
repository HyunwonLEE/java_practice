package practice_programmers;


class Solution_27394{

	public int[] solution (String[] students) {
		int[] answers = new int[students.length];
		int[] s_point = new int[students.length];
		for(int i = 0; i < students.length; i++) {
			int Lpoint = 0;
			int Ppoint = 0;
			String[] array = students[i].split("");
			for(int j = 0; j < students[i].length(); j++) {
				switch (array[j]) {
				case "A": {
					s_point[i]++;
					break;
				}case "L" :{
					Lpoint++;
					if(Lpoint == 2) {
						s_point[i]--;
						Lpoint = 0;
						Ppoint++;						
					}
					break;
				}case "P" :{
					s_point[i]--;
					Ppoint++;
					break;
				}			
				default:
					throw new IllegalArgumentException("Unexpected value: " + array[j]);
				}
				if(Ppoint == 3) {
					s_point[i] = 0;
					break;
				}
				
			}
		}
		
		int temp = 0;
		for(int i = 0; i < answers.length; i++) {
			answers[i]++;
			for(int j = i + 1 ; j < answers.length; j++) {
				if(s_point[i] < s_point[j]) {
					answers[i]++;
					
				}else {
					answers[j]++;
				}
			}
		}
		
		return answers;
	}
}

public class Programmers_27394_1 {

	public static void main(String[] args) {

		String[] students = {"ALALLAAPAA", "ALLLAAAPAA", "APAPALLAAA"};
		Solution_27394 s = new Solution_27394();
		for (int i : s.solution(students)) {
			System.out.println(i);
		}	
		
		
	}

}
