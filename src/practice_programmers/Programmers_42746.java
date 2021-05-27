package practice_programmers;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;


public class Programmers_42746 {

	public static void main(String[] args) {
		int[] numbers = { 0,0,0,0,0 };
		Solution_42746 solution = new Solution_42746();
		solution.solution(numbers);
	}

}

class Solution_42746 {
	public String solution(int[] numbers) {
		String answer = "";
		int temp = 0;
		int[] result = new int[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
		    if(numbers[i] >= 1000) result[i] = numbers[i];
			else if (numbers[i] >= 100)
				result[i] = numbers[i] * 10 + numbers[i] / 100;
			else if (numbers[i] >= 10)
				result[i] = numbers[i] * 100 + numbers[i];
			else
				result[i] = numbers[i] * 1000 +  numbers[i] * 100 + numbers[i] * 10 + numbers[i];
		}
		
		TreeMap<Integer, Integer> treemap = new TreeMap<Integer, Integer>();
		
		for (int i : result) {			
			treemap.put(temp, i);
			temp++;
		}
		List<Entry<Integer, Integer>> list = new ArrayList<>(treemap.entrySet());
		list.sort(Entry.comparingByValue(Collections.reverseOrder()));
		
		for (Entry<Integer, Integer> entry : list) {            
			answer += numbers[entry.getKey()];
		}		
        if(answer.indexOf("0") == 0) answer = "0";
		System.out.println(answer);
		return answer;
	}
}