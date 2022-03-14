package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class 좌표압축_18870_hashmap {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		int[] array = new int[N];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < arr.length; i++) {
			int temp = Integer.parseInt(arr[i]);
			list.add(temp);
			array[i] = temp;
		}
		Collections.sort(list);
		int win = 0;
		for(int i = 0; i < list.size(); i++) {
			if(!map.containsKey(list.get(i))) {
				map.put(list.get(i), win++);
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			sb.append(map.get(array[i])).append(" ");
		}
		System.out.println(sb.toString());
		
	}

}
