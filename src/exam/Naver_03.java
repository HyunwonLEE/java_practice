package exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class Naver_03 {

	public static void main(String[] args) {
		String[] logs = {"1901 1 100", "1901 2 100", "1901 4 100", "1901 7 100", "1901 8 100", "1902 2 100", "1902 1 100", "1902 7 100", "1902 4 100", "1902 8 100", "1903 8 100", "1903 7 100", "1903 4 100", "1903 2 100", "1903 1 100", "1101 1 95", "1101 2 100", "1101 4 100", "1101 7 100", "1101 9 100", "1102 1 95", "1102 2 100", "1102 4 100", "1102 7 100", "1102 9 100"};
		solution(logs);
	}
	
	public static String[] solution(String[] logs) {
        
		HashMap<String, Integer> cnt_map = new HashMap<String, Integer>();
		HashMap<String, ArrayList<String>> solution_map = new HashMap<String, ArrayList<String>>();
		HashMap<String, ArrayList<String>> point_map = new HashMap<String, ArrayList<String>>();
		ArrayList<String> log_list = new ArrayList<>(); 
		for(int i = 0; i < logs.length; i++) {
			String[] arr = logs[i].split(" ");
			if(cnt_map.containsKey(arr[0])) {
				
				if(solution_map.get(arr[0]).contains(arr[1])) {
					solution_map.get(arr[0]).remove(arr[1]);
				}else {
					cnt_map.put(arr[0], cnt_map.get(arr[0]) + 1);
				}
				solution_map.get(arr[0]).add(arr[1]);
				if(point_map.get(arr[0]).contains(arr[2])) {
					point_map.get(arr[0]).remove(arr[2]);
				}
				point_map.get(arr[0]).add(arr[2]);
			}else {
				cnt_map.put(arr[0], 1);
				solution_map.put(arr[0], new ArrayList<>());
				solution_map.get(arr[0]).add(arr[1]);
				point_map.put(arr[0], new ArrayList<>());
				point_map.get(arr[0]).add(arr[2]);
			}	
			if(!log_list.contains(arr[0])) {
				log_list.add(arr[0]);
			}
			
		}
		TreeSet<String> set = new TreeSet<>(); 
		for (int i = 0; i < log_list.size(); i++) {
			if(cnt_map.get(log_list.get(i))< 5) continue;
			for(int j = 0; j < log_list.size(); j++) {
				if(i != j &&cnt_map.get(log_list.get(i)) == cnt_map.get(log_list.get(j))) {
					if(solution_map.get(log_list.get(i)).containsAll(solution_map.get(log_list.get(j)))) {
						if(point_map.get(log_list.get(i)).containsAll(point_map.get(log_list.get(j)))) {
							set.add(log_list.get(i));
						}
					}	
				}
				
			}
			
		}
		
		if(set.size() == 0) {
			String[] answer = {"None"};
			return answer;
		}
        
		String[] answer = new String[set.size()];
		Iterator<String> ir = set.iterator();
		int index = 0;
		while(ir.hasNext()) {
			answer[index] = ir.next();
			index++;
		}
        return answer;
    }

}
