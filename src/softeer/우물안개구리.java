package softeer;

import java.util.HashMap;
import java.util.Scanner;

public class 우물안개구리 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int N = sc.nextInt();
		int M = sc.nextInt();

		HashMap<Integer, Integer> map = new HashMap<>();
		int[] W = new int[N];
		for (int i = 0; i < N; i++) {
			W[i] = sc.nextInt();
			map.put(i + 1, W[i]);

		}

		for (int i = 0; i < M; i++) {

			int A = sc.nextInt();
			int B = sc.nextInt();

			if (W[A-1] > W[B-1]) {
				map.remove(B);
			} else if (W[A-1] < W[B-1]) {
				map.remove(A);
			} else {
				map.remove(A);
				map.remove(B);
			}

		}

		result = map.size();

		System.out.println(result);
	}

}
