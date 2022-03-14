package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 좌표압축_18870 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		Rank[] rank = new Rank[N];

		for (int i = 0; i < arr.length; i++) {
			int num = Integer.parseInt(arr[i]);
			rank[i] = new Rank(i, num, 0);
		}
		Arrays.sort(rank, new Comparator<Rank>() {

			@Override
			public int compare(Rank o1, Rank o2) {
				return o1.num - o2.num;
			}

		});
		int win = 0;
		for(int i = 1; i < rank.length; i++) {
			if(rank[i].num != rank[i-1].num) {
				win++;
			}
			rank[i].win = win;
		}

		Arrays.sort(rank, new Comparator<Rank>() {

			@Override
			public int compare(Rank o1, Rank o2) {
				return o1.index - o2.index;
			}

		});

		for (int i = 0; i < rank.length; i++) {
			sb.append(rank[i].win).append(" ");
		}

		System.out.println(sb.toString());
	}

}

class Rank {
	int index;
	int num;
	int win;

	Rank() {

	}

	Rank(int index, int num, int win) {
		this.index = index;
		this.num = num;
		this.win = win;
	}
}