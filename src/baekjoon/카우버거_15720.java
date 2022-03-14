package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 카우버거_15720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		String[] cnt = br.readLine().split(" ");
		int max = 0;
		
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		
		for(int i = 0; i < cnt.length; i++) {
			int temp = Integer.parseInt(cnt[i]);
			StringTokenizer st = new StringTokenizer(br.readLine());
			if(max < temp) max = temp;
			for(int j = 0; j < temp; j++) {
				if(!map.containsKey(i)) {

					map.put(i, new ArrayList<Integer>());
				}
				map.get(i).add(Integer.parseInt(st.nextToken()));
			}
			Collections.sort(map.get(i), Collections.reverseOrder());
		}	
		int sum = 0;
		int dis_sum = 0;
		for(int i = 0; i < max; i++) {
			
			int discount = 0;
			boolean yn = true;
			for(int j = 0; j < 3; j++ ) {
				if(map.get(j).size() > 0) {
					discount += map.get(j).get(0);
					map.get(j).remove(0);
				}else {
					yn = false;
				}
			}
			sum += discount;
			if(yn) discount *= 0.9;
			dis_sum += discount;
		}
		System.out.println(sum);
		System.out.println(dis_sum);
		
	}

}
