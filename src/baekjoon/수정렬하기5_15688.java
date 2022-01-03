package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수정렬하기5_15688 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] arr = new int[2000001];
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			int a = Integer.parseInt(br.readLine()) + 1000000;
			arr[a]++;
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i]; j++) {
				sb.append(i - 1000000).append('\n');
			}
		}
		
		System.out.println(sb.toString());
		
	}

}
