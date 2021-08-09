package practice_programmers;

import java.util.LinkedList;
import java.util.Queue;


class Solution_42587 {
    public int solution(int[] priorities, int location) {
        int answer = location;
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < priorities.length; i++) {
        	queue.add(priorities[i]);
        }
        for(int index = 0; index < queue.size() -1; index++) {
        	boolean swap = false;
        	for(int index2 = 1; index2 < queue.size(); index2++) {
        		if(queue.peek() < priorities[index2]) {
        			queue.add(queue.peek());
        			queue.poll();        			
        		}
        	}

        }
        
        
        return answer;
    }
}
public class Programmers_42587 {

	public static void main(String[] args) {
		int[] priorites = {1, 1, 9, 1, 1, 1};
		int location = 0;
		Solution_42587 s = new Solution_42587();
		s.solution(priorites, location);

	}

}
