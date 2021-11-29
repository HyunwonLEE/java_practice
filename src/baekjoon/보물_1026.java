package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class º¸¹°_1026 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		String[] aarr = br.readLine().split(" ");
		String[] barr = br.readLine().split(" ");
		int[] iarr = new int[aarr.length];
		B_sorted[] b_sorted = new B_sorted[barr.length];
		for (int i = 0; i < barr.length; i++) {
			iarr[i] = Integer.parseInt(aarr[i]);
			b_sorted[i] = new B_sorted(i, Integer.parseInt(barr[i]));
		}
		
		Arrays.sort(iarr);
		Arrays.sort(b_sorted, new Comparator<B_sorted>() {

			@Override
			public int compare(B_sorted o1, B_sorted o2) {
				return o2.B - o1.B;
			}
		});
		
		int sum = 0;
		for(int i = 0; i < N; i++) {
			sum += iarr[i] * b_sorted[i].B;
		}
		System.out.println(sum);
	}

}

class B_sorted {
	int B;
	int index;

	B_sorted() {

	}

	B_sorted(int index, int B) {
		this.index = index;
		this.B = B;

	}
}