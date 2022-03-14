package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 접미사배열_11656 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str = br.readLine();
		Sort[] arr = new Sort[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = new Sort(str.substring(i, str.length()));
		}

		Arrays.sort(arr, new Comparator<Sort>() {

			@Override
			public int compare(Sort o1, Sort o2) {
				int index = 0;
				while (true) {
					if (o1.word.charAt(index) != o2.word.charAt(index))
						return o1.word.charAt(index) - o2.word.charAt(index);						
					index++;
					if(o1.length <= index || o2.length <= index)
						return o1.length - o2.length;
				}
				
			}

		});

		for (Sort sort : arr) {
			sb.append(sort.word).append('\n');
		}
		System.out.println(sb.toString());

	}

}

class Sort {
	int length;
	String word;

	public Sort() {

	}

	public Sort(String word) {
		this.length = word.length();
		this.word = word;
	}
}