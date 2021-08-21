package exam;


import java.util.HashSet;
import java.util.Set;

public class Practice01 {

	public static void main(String[] args) {

		Solution_p1 s = new Solution_p1();
		int[][] v = { { 1, 4 }, { 3, 4 }, { 3, 10 } };
		s.solution(v);
	}

}

class Solution_p1 {
	public int[] solution(int[][] v) {
		int[] answer = new int[2];
		Set<Integer> set_x = new HashSet<>();
		Set<Integer> set_y = new HashSet<>();
		for(int i = 0; i < 3; i++) {
			if(set_x.contains(v[i][0])) {
				set_x.remove(v[i][0]);
			}else {
				set_x.add(v[i][0]);
			}
			if(set_y.contains(v[i][1])) {
				set_y.remove(v[i][1]);
			}else {
				set_y.add(v[i][1]);
			}
		}
		answer[0] = set_x.iterator().next();
		
		answer[1] = set_y.iterator().next();
				

		return answer;
	}
}