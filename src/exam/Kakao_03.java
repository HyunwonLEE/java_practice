package exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class Kakao_03 {

	public static void main(String[] args) {
		int[] fees = { 180, 5000, 10, 600 };
		String[] records = { "05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN",
				"18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT" };

		int[] arr = solution(fees, records);
	}

	public static int[] solution(int[] fees, String[] records) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		TreeMap<String, Integer> result_map = new TreeMap<String, Integer>();

		for (int i = 0; i < records.length; i++) {
			String[] arr = records[i].split(" ");

			if (map.containsKey(arr[1])) {
				String[] input = map.get(arr[1]).split(":");
				String[] output = arr[0].split(":");
				
				int diffMin = ((Integer.parseInt(output[0]) - Integer.parseInt(input[0])) * 60) + (Integer.parseInt(output[1]) - Integer.parseInt(input[1]));			
				if(result_map.containsKey(arr[1])) {
					result_map.put(arr[1], result_map.get(arr[1]) + diffMin);
				}else {
					result_map.put(arr[1], diffMin);	
				}
				
				
				map.remove(arr[1]);

			} else {
				map.put(arr[1], arr[0]);
			}			
		}
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String[] input = map.get(key).split(":");
			int diffMin = ((23 - Integer.parseInt(input[0])) * 60) + (59 - Integer.parseInt(input[1]));
			if(result_map.containsKey(key)) {
				result_map.put(key, result_map.get(key) + diffMin);
			}else {
				result_map.put(key, diffMin);	
			}
		}
		Iterator<String> it2 = result_map.keySet().iterator();
		int[] answer = new int[result_map.size()];
		int i = 0;
		while(it2.hasNext()) {
			String key = it2.next();
			if(result_map.get(key) > fees[0]) {
				int fee = (int) (fees[1] + Math.ceil((((double)result_map.get(key) - fees[0]) / fees[2])) * fees[3]);
				result_map.put(key, fee);
			}else {
				result_map.put(key, fees[1]);
			}
			answer[i] = result_map.get(key);
			i++;
		}

		return answer;
	}

}
