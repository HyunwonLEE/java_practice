package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.TreeSet;

public class 듣보잡_1764 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] arr = br.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int M = Integer.parseInt(arr[1]);
		HashSet<String> hashset = new HashSet<String>();
		TreeSet<String> treeset = new TreeSet<>();
		for (int i = 0; i < N; i++) {
			hashset.add(br.readLine());
		}
		for (int i = 0; i < M; i++) {
			String str = br.readLine();
			if (hashset.contains(str)) {
				treeset.add(str);
			}
		}
		sb.append(treeset.size()).append('\n');
		for (String string : treeset) {
			sb.append(string).append('\n');
		}
		System.out.println(sb.toString());
	}

}
