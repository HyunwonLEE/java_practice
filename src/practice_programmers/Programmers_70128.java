package practice_programmers;

class Solution_70128 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i = 0; i < a.length; i++) {
        	answer += a[i]*b[i];
        }
        
        
        return answer;
    }
}

public class Programmers_70128 {

	public static void main(String[] args) {

		Solution_70128 s = new Solution_70128();
		int[] a = {};
		int[] b = {};
		System.out.println(s.solution(a, b));
	}

}
