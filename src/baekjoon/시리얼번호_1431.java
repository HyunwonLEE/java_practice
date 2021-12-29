package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 시리얼번호_1431 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		SerialSort[] serialsort = new SerialSort[N];
		for (int i = 0; i < N; i++) {
			serialsort[i] = new SerialSort(br.readLine());
		}

		Arrays.sort(serialsort, new Comparator<SerialSort>() {

			@Override
			public int compare(SerialSort o1, SerialSort o2) {
				if (o1.lenght == o2.lenght) {
					
					if (o1.sum == o2.sum) {
						for (int i = 0; i < o1.lenght; i++) {
							if (o1.word.charAt(i) < o2.word.charAt(i)) {
								return o1.word.charAt(i) - o2.word.charAt(i);
							}else if(o2.word.charAt(i) < o1.word.charAt(i)) {
								return o2.word.charAt(i) - o2.word.charAt(i);
							}

						}

					}
					return o1.sum - o2.sum;
				}

				return o1.lenght - o2.lenght;
			}
		});

		for (int i = 0; i < serialsort.length; i++) {
			sb.append(serialsort[i].word).append('\n');
		}
		System.out.println(sb.toString());
	}

}

class SerialSort {
	String word;
	int lenght;
	int sum;

	SerialSort() {

	}

	SerialSort(String word) {
		this.word = word;
		this.lenght = word.length();

		word = word.replaceAll("[A-Z]", "");
		if (word.length() == 0)
			this.sum = 0;
		else {
			String[] arr = word.split("");
			for (int i = 0; i < arr.length; i++) {
				this.sum += Integer.parseInt(arr[i]);
			}
		}

	}
}