package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class YangjojangofTheYear_11557 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			int M = Integer.parseInt(br.readLine());
			HashMap<Integer, String> map = new HashMap<Integer, String>();
			PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
			for(int j = 0; j < M; j++) {
				String[] arr = br.readLine().split(" ");
				int a = Integer.parseInt(arr[1]);
				map.put(a, arr[0]);
				queue.add(a);
			}			
			sb.append(map.get(queue.poll())).append('\n');
		}
		System.out.println(sb.toString());
	}

}
