package practice_programmers;


import java.util.TreeSet;

public class Index_Programmers {

	public static void main(String[] args) {
		Solution_index solution = new Solution_index();
		int[] numbers = {2,1,3,4,1};
		solution.solution(numbers);

	}

}

class Solution_index {
    public int[] solution(int[] numbers) {        
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        for(int i = 0; i < numbers.length; i++) {
        	for(int j = i+1; j < numbers.length; j++) {
        		treeSet.add(numbers[i] + numbers[j]);
        	}
        }
        int a = 0;
        int[] answer = new int[treeSet.size()];
        for (Integer integer : treeSet) {
			answer[a] = integer;
			//System.out.println(integer);
		}        
        
        
        return answer;
    }
}