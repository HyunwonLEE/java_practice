package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자카드_10815 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] countingsort = new int[20000001];
		String[] arr = br.readLine().split(" ");		
		for(int i = 0; i <N; i++) {
			int temp = Integer.parseInt(arr[i]);
			countingsort[temp + 10000000]++;
		}
		int M = Integer.parseInt(br.readLine());
		String[] arr2 = br.readLine().split(" ");
		for(int i = 0; i < M; i++) {
			int temp = Integer.parseInt(arr2[i]) + 10000000;
			if(countingsort[temp] > 0) {
				sb.append("1").append(" ");
			}else {
				sb.append("0").append(" ");
			}
			
		}
		System.out.println(sb.toString());
 	}

}
