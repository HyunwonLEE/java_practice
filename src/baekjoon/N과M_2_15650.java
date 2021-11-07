package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N��M_2_15650 {
	static StringBuilder sb = new StringBuilder();
	static int N, M;
	static int[] selected;
	static boolean[] checked, notexist;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		selected = new int[M + 1];
		checked = new boolean[N + 1];
		notexist = new boolean[N + 1];

		rec_func(1);

		System.out.println(sb.toString());
	}

	public static void rec_func(int k) {
		if (k == M + 1) {
			for (int i = 1; i <= M; i++) {
				sb.append(selected[i]).append(' ');
			}
			sb.append('\n');

		} else {
			for (int cand = selected[k-1] + 1; cand <= N; cand++) {
				selected[k] = cand;
				rec_func(k + 1);
				selected[k] = 0;

			}
		}

	}

}
