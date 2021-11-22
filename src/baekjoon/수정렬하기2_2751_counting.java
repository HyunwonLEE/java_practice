 package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 수정렬하기2_2751_counting {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int[] counting = new int[2000001]; 
		for (int i = 0; i < N; i++) {
			int temp = Integer.parseInt(br.readLine())+1000000;
			counting[temp]++;
		}
		for(int i = 0; i < counting.length; i++) {
			if(counting[i] > 0) {
				sb.append(i - 1000000).append('\n');
			}
		}
		

		
	
		System.out.println(sb.toString());
	}

}
