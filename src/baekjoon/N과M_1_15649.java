package baekjoon;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M_1_15649 {
	
	static StringBuilder sb = new StringBuilder();
	static int N, M;
	static int[] selected;
	static boolean[] check;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());		
		br.close();
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		selected = new int[M + 1];
		check = new boolean[N + 1];
		sequence(0);

		System.out.println(sb);
	}

	public static void sequence(int k) {
		if (k == M) {

			for (int i = 0; i < M; i++) {
				sb.append(selected[i]).append(' ');
			}
			sb.append('\n');
			return;

		} else {
			for (int cand = 1; cand <= N; cand++) {
				if(!check[cand]) {
					selected[k] = cand;					
					check[cand] = true;
					sequence(k + 1);	
					selected[k] = 0;
					check[cand] = false;
				}			
				

			}

		}
	}

}
