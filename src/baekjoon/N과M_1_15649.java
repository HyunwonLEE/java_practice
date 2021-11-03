package baekjoon;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class N°úM_1_15649 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static int N, M;
	static int[] selected;

	public static void main(String[] args) throws IOException {

		String[] arr = br.readLine().split(" ");
		br.close();
		N = Integer.parseInt(arr[0]);
		M = Integer.parseInt(arr[1]);
		selected = new int[M + 1];

		sequence(0);

		System.out.println(sb);
	}

	public static void sequence(int k) {
		if (k == M) {

			for (int i = 0; i < M; i++) {
				sb.append(selected[i] + " ");
			}
			sb.append("\n");
			return;

		} else {
			for (int cand = 1; cand <= N; cand++) {
				selected[k] = cand;
				sequence(k + 1);
				selected[k] = 0;

			}

		}
	}

}
