package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class 일곱난쟁이_2309 {
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static StringBuilder sb = new StringBuilder();
	static int sum;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 9; i++) {
			int temp = Integer.parseInt(br.readLine());
			list.add(temp);
			sum += temp;
		}
		sum -= 100;
		int[] index = new int[2];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (j != i) {
					if (sum == list.get(i) + list.get(j)) {
						index[0] = i;
						index[1] = j;
					}
				}
			}
		}

		list.remove(index[0]);
		list.remove(index[1]);

		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)).append('\n');
		}
		System.out.println(sb.toString());
	}

}
