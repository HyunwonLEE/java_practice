package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N°úM_3_15651 {
	static StringBuilder sb = new StringBuilder();
	static int N, M;
	static int[] selected;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		selected = new int[M + 1];
		rec_func(0);
		System.out.println(sb.toString());

	}

	public static void rec_func(int k) {
		if (k == M) {
			for (int i = 0; i < M; i++) {
				sb.append(selected[i]).append(' ');
			}
			sb.append('\n');
		} else {
			for (int cand = 1; cand <= N; cand++) {
				selected[k] = cand;
				rec_func(k + 1);
				selected[k] = 0;
			}
		}

	}
}
