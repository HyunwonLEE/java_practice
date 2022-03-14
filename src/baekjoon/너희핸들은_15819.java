package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 너희핸들은_15819 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] arr = br.readLine().split(" ");

		int N = Integer.parseInt(arr[0]);
		int index = Integer.parseInt(arr[1]);
		Sorting[] sorting = new Sorting[N];
		for (int i = 0; i < N; i++) {
			sorting[i] = new Sorting(br.readLine());
		}

		Arrays.sort(sorting, new Comparator<Sorting>() {

			@Override
			public int compare(Sorting o1, Sorting o2) {
				if (o1.name_length > o2.name_length) {
					for (int i = 0; i < o2.name_length; i++) {
						if (o1.name.charAt(i) != o2.name.charAt(i))
							return o1.name.charAt(i) - o2.name.charAt(i);
					}

				} else {
					for (int i = 0; i < o1.name_length; i++) {
						if (o1.name.charAt(i) != o2.name.charAt(i))
							return o1.name.charAt(i) - o2.name.charAt(i);
					}

				}
				return o1.name_length - o2.name_length;

			}

		});
		System.out.println(sorting[index - 1].name);

	}

}

class Sorting {
	String name;
	int name_length;

	Sorting() {

	}

	public Sorting(String name) {
		this.name = name;
		this.name_length = name.length();
	}
}