package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N°úM_4_15652 {

	static StringBuilder sb = new StringBuilder();
	static int N, M;
	static int[] selected;
	static boolean[] checked;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		selected = new int[M + 1];
		checked = new boolean[N + 1];
		re_func(1);
		System.out.println(sb.toString());

	}

	public static void re_func(int k) {
		if (k == M + 1) {
			for (int i = 1; i <= M; i++) {
				sb.append(selected[i]).append(' ');
			}
			sb.append('\n');
		} else {
			int start = selected[k-1];
			if(start == 0) start = 1;
			for (int cand = start; cand <= N; cand++) {
				selected[k] = cand;
				re_func(k + 1);
				selected[k] = 0;


				
			}
		}
	}

}
