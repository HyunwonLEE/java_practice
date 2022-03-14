package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class 수정렬하기4_11931 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		TreeSet<Integer> set = new TreeSet<Integer>(Collections.reverseOrder());
		for(int i = 0; i < N; i++) {
			set.add(Integer.parseInt(br.readLine()));
		}
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			sb.append(it.next()).append('\n');
		}
		
		System.out.println(sb.toString());
	}

}



