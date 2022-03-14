package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 중복빼고정렬하기_10867 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[2001];
		String[] sarr = br.readLine().split(" ");
		for(int i = 0; i < N; i++) {
			int a = Integer.parseInt(sarr[i]) + 1000;
			arr[a]++;
			
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > 0) {
				sb.append(i -1000).append(' ');
			}
		}
		System.out.println(sb.toString());
	
	}

}
