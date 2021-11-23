package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 애너그램_6996 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String[] arr = br.readLine().split(" ");
			String[] first = arr[0].split("");
			String[] second = arr[1].split("");
			Arrays.sort(first);
			Arrays.sort(second);
			if (arr[0].length() == arr[1].length()) {
				boolean right = true;
				for (int j = 0; j < first.length; j++) {
					if (!first[j].equals(second[j])) {
						right = false;
						break;
					}
				}
				if(right) {
					sb.append(arr[0]).append(" & ").append(arr[1]).append(" are anagrams.").append('\n');
					continue;
				}
				
			}
			sb.append(arr[0]).append(" & ").append(arr[1]).append(" are NOT anagrams.").append('\n');
		}
		System.out.println(sb.toString());
	}

}

//blather & reblath are anagrams.
//maryland & landam are NOT anagrams.