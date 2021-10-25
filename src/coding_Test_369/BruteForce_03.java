package coding_Test_369;

public class BruteForce_03 {

	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		input();

		re_func(1);
		System.out.println(sb.toString());

	}

	static void input() {
		FastReader scan = new FastReader();
		N = scan.nextInt();
		M = scan.nextInt();
		selected = new int[M + 1];

	}

	static int N, M;
	static int[] selected;

	static void re_func(int k) {
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
