package practice_programmers;

import java.util.ArrayList;

class Solution_42587 {
	public int solution(int[] priorities, int location) {
		int answer = location;
		ArrayList<Integer> queue = new ArrayList<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> queue_index = new ArrayList<Integer>();
		ArrayList<Integer> list_index = new ArrayList<Integer>();
		for (int i = 0; i < priorities.length; i++) {
			queue.add(priorities[i]);
			if(i == location) queue_index.add(1);
			else queue_index.add(0);
		}
		
		while (queue.size() > 0) {	
			
			for(int index = 1; index < queue.size(); index++) {
				int temp = queue.get(0);
				int temp_index = queue_index.get(0);
				if(queue.get(0) < queue.get(index)) {
					queue.remove(0);
					queue.add(temp);
					queue_index.remove(0);
					queue_index.add(temp_index);
					index = 0;
				}
			}
			list.add(queue.get(0));
			list_index.add(queue_index.get(0));
			queue_index.remove(0);
			queue.remove(0);
			

		}		
		
		for (int i = 0; i < list_index.size(); i++) {
			if(list_index.get(i) == 1) answer = i;;
		}
		return answer;
	}
}

public class Programmers_42587 {

	public static void main(String[] args) {
		int[] priorites = { 1, 2, 3, 4, 5, 6 };
		int location = 0;
		Solution_42587 s = new Solution_42587();
		System.out.println(s.solution(priorites, location));

	}

}
