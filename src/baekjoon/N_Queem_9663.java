package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class N_Queem_9663 {
	static ArrayList<Integer> list = new ArrayList<>();
	static StringBuilder sb = new StringBuilder();
	static int result = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		rec_func(0, N);
		System.out.println(sb.toString());
		System.out.println(result);
	}

	static void rec_func(int k, int N) {
		if (k == N) {
			for (int i = 0; i < list.size(); i++) {
				sb.append(list.get(i)).append(' ');
			}
			sb.append('\n');

			result++;

		} else {

			for (int i = 0; i < N; i++) {
				if (check_func(i, N)) {
					list.add(i);
					rec_func(k + 1, N);
					list.remove(list.size() - 1);
				}

			}

		}

	}

	static boolean check_func(int i, int N) {
		int currentRow = list.size();
		if (list.size() == 0)
			return true;
		for (int index = 0; index < list.size(); index++) {
			if (list.get(index) == i)
				return false;

			if (Math.abs(list.get(index) - i) == currentRow - index)
				return false;

		}

		return true;

	}

}
