package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 등수매기기_2012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		ExpectedRank[] exp = new ExpectedRank[N];

		int[] arr = new int[500001];
		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(br.readLine());
			arr[a]++;
		}
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				for (int j = 0; j < arr[i]; j++) {
					exp[index] = new ExpectedRank(i, index + 1);
					index++;
				}

			}

		}

		long sum = 0;
		for (int i = 0; i < exp.length; i++) {
			sum += Math.abs(exp[i].expected - exp[i].real);
		}
		sb.append(sum);
		System.out.println(sb.toString());

	}
}

class ExpectedRank {
	int expected;
	int real;

	ExpectedRank() {

	}

	ExpectedRank(int expected, int real) {
		this.expected = expected;
		this.real = real;
	}
}