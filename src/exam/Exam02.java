package exam;

import java.util.ArrayList;
import java.util.Collections;

public class Exam02 {

	public static void main(String[] args) {

		int leave = 30;
		String day = "mon";
		Integer[] holidays = { 6, 21, 23, 27, 28 };

		int s = solution(leave, day, holidays);

	}

	public static int solution(int leave, String day, Integer[] holidays) {
		int answer = -1;

		
		ArrayList<Integer> holidays_list = new ArrayList<Integer>();
		for(int i = 0; i < holidays.length; i++) {
			holidays_list.add(holidays[i]);
		}
		String[] days = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };
		int index = 0;
		for(int i = 0; i < days.length; i++)
			if(day.toUpperCase().equals(days[i])) {
				index = i;
				break;
			}

		
		for(int i = 1; i <=30; i++) {
			if(days[index].equals(days[5]) || days[index].equals(days[6])) {
				if(!holidays_list.contains(i)) {
					holidays_list.add(i);
				}
				
			}	
			index++;
			if(index > days.length-1) index = 0;
			
		}
		Collections.sort(holidays_list);
		int max = 0;
		int temp = 0;
		int temp_leave = leave;
		for(int i = 1; i <=30; i++) {
			if(!holidays_list.contains(i)) {
				temp_leave--;
			}	
			
			
			if(temp_leave < 0) {
				temp_leave = leave;
				if(temp > max) {
					max = temp;
				}
				temp = 0;
			}
			
			
			temp++;
			
		}
		
		if(temp > max)
			answer = temp;
		else answer = max;
		return answer;
	}

}
