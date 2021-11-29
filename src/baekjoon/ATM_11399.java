package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ATM_11399 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		int[] iarr = new int[N];
		for(int i = 0; i < N; i++) {
			iarr[i] = Integer.parseInt(arr[i]);
		}
		Arrays.sort(iarr);
		int sum = 0;
		int time = 0;
		for(int i = 0; i < N; i++) {
			time += iarr[i];
			sum += time;
		}
		
		System.out.println(sum);
	}

}
