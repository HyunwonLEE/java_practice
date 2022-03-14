package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class 암기왕_2776 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		int N = Integer.parseInt(br.readLine());
		HashSet<String> set = new HashSet<String>();
		String[] Narr = br.readLine().split(" ");
		for(int i = 0; i < N; i++) {
			set.add(Narr[i]);
		}
		
		int M = Integer.parseInt(br.readLine());
		String[] Marr = br.readLine().split(" ");
		for(int i = 0; i < M; i++) {
			if(set.contains(Marr[i])) {
				sb.append("1").append('\n');
				set.remove(Marr[i]);
			}else {
				sb.append("0").append('\n');
			}
		}
		System.out.println(sb.toString());
	}

}
