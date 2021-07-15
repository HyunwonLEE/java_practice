package practice_programmers;

import java.util.ArrayList;
import java.util.Collections;


class Solution_42626 {
    public int solution(int[] scoville, int K) {
        int answer = 0;        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < scoville.length; i++) {
        	if(scoville[i] < K) list.add(scoville[i]);
        }
        if(list.size() < 2) return -1;
        
        Collections.sort(list);
        
        while(list.size() != 0) {
        	list.
        	list.add(list.get(0));
        }

        
        
        
        
        
        
        return answer;
    }
}
public class Programmers_42626 {

	public static void main(String[] args) {

		int[] scoville = {1,2,3,9,10,12,8};
		int k = 7;
		Solution_42626 s = new Solution_42626();
		System.out.println(s.solution(scoville, k));
	}

}
