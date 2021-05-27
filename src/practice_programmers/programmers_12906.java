package practice_programmers;

import java.util.ArrayList;

public class programmers_12906 {
	
    public int[] solution(int []arr) {

    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(arr[0]);
    	for(int i =1; i < arr.length; i++) {
    		if(list.get(list.size()-1) != arr[i]) {
    			list.add(arr[i]);
    		}
    	}
    	int[] answer = new int[list.size()];
    	for(int i =0; i<list.size(); i++) {
    		answer[i] = list.get(i);
    	}
    	
        
        return answer;
    }

  

}
