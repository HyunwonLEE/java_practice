package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class K번째수_11004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String[] arr = br.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int K = Integer.parseInt(arr[1]);
		
		String[] nums = br.readLine().split(" ");
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < nums.length; i++) {
			list.add(Integer.parseInt(nums[i]));
		}
		
		Collections.sort(list);
		sb.append(list.get(K-1));
		System.out.println(sb.toString());
	}

}
