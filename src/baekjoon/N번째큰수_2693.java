package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N번째큰수_2693 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" ");
			int[] arr = new int[str.length];
			for(int j = 0; j < str.length; j++) {
				arr[j] = Integer.parseInt(str[j]);
			}
			Arrays.sort(arr);
			sb.append(arr[7]).append('\n');
		}
		
		System.out.println(sb.toString());
	}

}
