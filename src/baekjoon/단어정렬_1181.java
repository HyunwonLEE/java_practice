package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 단어정렬_1181 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < N; i++) {
			set.add(br.readLine());

		}
		List<String> list = new ArrayList<String>(set);

		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				if (o1.length() == o2.length()) {
					for (int i = 0; i < o1.length(); i++) {
						if (o1.charAt(i) != o2.charAt(i))
							return o1.charAt(i) - o2.charAt(i);
					}

				}
				return o1.length() - o2.length();
			}
		});

		for (int i = 0; i < list.size(); i++) {
			bw.append(list.get(i) + "\n");
		}

		bw.flush();
	}

}
