package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class 점수집계_9076 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			String[] arr = br.readLine().split(" ");
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int j = 0; j < arr.length; j++) {
				list.add(Integer.parseInt(arr[j]));
				
			}
			Collections.sort(list);
			list.remove(0);
			list.remove(list.size()-1);
			if(list.get(list.size()-1) - list.get(0) >= 4) {
				sb.append("KIN").append('\n');
			}else {
				int sum = 0;
				for (Integer a : list) {
					sum+=a;
				}
				sb.append(sum).append('\n');
			}
		}
		System.out.println(sb.toString());

	}

}
