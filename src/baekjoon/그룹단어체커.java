package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class 그룹단어체커 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());		
		
		HashSet<Character> set = new HashSet<>();
		int answer = 0;
		for (int index = 0; index < N; index++) {
			String str = br.readLine();
			char first = str.charAt(0);
			set.add(first);
			boolean b = true;
			
			for (int i = 1; i < str.length(); i++) {				
				if (first != str.charAt(i)) {
					if (set.contains(str.charAt(i))) {
						b = false;
						break;
					}
					first = str.charAt(i);
					set.add(str.charAt(i));
				}
				

			}
			if (b)
				answer++;
			set.removeAll(set);
		}

		bw.write(answer+"\n");
		bw.flush();
	}

}
