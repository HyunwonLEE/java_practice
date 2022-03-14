package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeSet;

public class 수정렬하기2_2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 0; i < N; i++) {
			int temp = Integer.parseInt(br.readLine());
			set.add(temp);
		}
		
		Iterator<Integer> ir = set.iterator();
		while(ir.hasNext()) {
			sb.append(ir.next()).append('\n');
		}		
	
		System.out.println(sb.toString());
	}

}
