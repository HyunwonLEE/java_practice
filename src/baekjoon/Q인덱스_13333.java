package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q¿Œµ¶Ω∫_13333 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		int[] iarr = new int[N];
		for(int i = 0; i < arr.length; i++) {
			iarr[i] = Integer.parseInt(arr[i]);
		}
		Arrays.sort(iarr);
		int q_index = 0;
		
		for(int i = 0; i < iarr.length; i++) {
			
			if(iarr[i] == iarr.length - i) {
				q_index = iarr[i];
			}
		}
		System.out.println(q_index);
		
	}

}
