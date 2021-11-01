package exam;

import java.util.HashMap;
import java.util.HashSet;

public class Naver_01 {

	public static void main(String[] args) {
		String[] id_list = { "JAY", "JAY ELLE JAY MAY", "MAY ELLE MAY", "ELLE MAY", "ELLE ELLE ELLE", "MAY"};
		int k = 3;
		System.out.println(solution(id_list, k));
	}

	public static int solution(String[] id_list, int k) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        HashSet<String> set = new HashSet<String>();
        for(int i = 0; i < id_list.length; i++) {
        	String[] arr = id_list[i].split(" ");        	 
        	
        	for(int j =0; j < arr.length; j++) {
        		if(map.containsKey(arr[j])) {
        			if(map.get(arr[j]) < k && !set.contains(arr[j])) {
        				set.add(arr[j]);
        				map.put(arr[j], map.get(arr[j]) + 1);
        				answer++;
        			}
        			
        		}else {
        			set.add(arr[j]);
        			map.put(arr[j], 1);
        			answer++;
        		}
        	}
        	set.removeAll(set);
        }
        return answer;
    }

}
