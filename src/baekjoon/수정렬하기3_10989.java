package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 수정렬하기3_10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] counting = new int[10001];
		for(int i = 0; i < N; i++) {
			int temp = Integer.parseInt(br.readLine());
			counting[temp]++;
		}
		
		for(int i = 0; i < counting.length; i++) {
			for(int j = 0; j < counting[i]; j++) {
				sb.append(i).append('\n');
			}
		}
		
		System.out.println(sb.toString());
		
		

	}

}
