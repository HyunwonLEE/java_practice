package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class 수정렬하기2_2751_counting {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int[] counting = new int[20000001]; 
		for (int i = 0; i < N; i++) {
			int temp = Integer.parseInt(br.readLine());
			set.add(temp);
		}
		

		while(ir.hasNext()) {
			sb.append(ir.next()).append('\n');
		}		
	
		System.out.println(sb.toString());
	}

}
