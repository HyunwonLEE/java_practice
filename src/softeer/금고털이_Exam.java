package softeer;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class 금고털이_Exam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int W = Integer.parseInt(sc.next());
		int N = Integer.parseInt(sc.next());
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>(Collections.reverseOrder());
		int result = 0;
		for (int i = 0; i < N; i++) {
			Integer[] arr = new Integer[2];
			arr[0] = Integer.parseInt(sc.next());
			arr[1] = Integer.parseInt(sc.next());	
			
			if(map.containsKey(arr[1])) {
				map.put(arr[1], map.get(arr[1]) + arr[0]);
			}else{
				map.put(arr[1], arr[0]);	
			}			
		}
		
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()) {	
			int price = it.next();
			int weight = map.get(price);
			
			
			if(W > weight) {
				W = W - weight;
				result = result + (weight * price);
			}else {
				result = result + (W * price);
				W = 0;
			}
			if(W == 0) break;
		}		
		


		System.out.println(result);

	}

}
