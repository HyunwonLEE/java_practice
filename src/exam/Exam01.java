package exam;

import java.util.TreeSet;

public class Exam01 {

	public static void main(String[] args) {

		String[] registered_list = { "bird99", "bird98", "bird101", "gotoxy"};
		String new_id = "bird";
		String s = solution(registered_list, new_id);
		System.out.println(s);
	}

	public static String solution(String[] registered_list, String new_id) {
	        String answer = "";
	        TreeSet<String> set = new TreeSet<>();
	        
	        for(int i =0; i < registered_list.length; i++) {
	        	set.add(registered_list[i]);
	        }
	        
	        String S = new_id.replaceAll("[0-9]", "");
	        
	        int N = 0;
	        if(!new_id.replaceAll("[^0-9]", "").isEmpty()) {
	        	N = Integer.valueOf(new_id.replaceAll("[^0-9]", ""));
	        }
	        
	        System.out.println(S + "," + N);
	        while(set.contains(new_id)) {
	        	N++;
	        	new_id = S + N;
	        }
	        


	        
	        
	        
	        return answer = new_id;
	    	}

}
