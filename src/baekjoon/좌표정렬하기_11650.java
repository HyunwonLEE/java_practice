package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class 좌표정렬하기_11650 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		Sorted[] sorted = new Sorted[N];
		for (int i = 0; i < N; i++) {
			String[] arr = br.readLine().split(" ");
			int x_pos = Integer.parseInt(arr[0]);
			int y_pos = Integer.parseInt(arr[1]);
			sorted[i] = new Sorted(x_pos, y_pos);

		}
		
		Arrays.sort(sorted, new Comparator<Sorted>() {

			@Override
			public int compare(Sorted o1, Sorted o2) {
				if(o1.x_pos == o2.x_pos) {
					return o1.y_pos - o2.y_pos;
				}
				return o1.x_pos - o2.x_pos;
			}
		});

		for(int i = 0; i < sorted.length; i++) {
			bw.append(sorted[i].x_pos + " " + sorted[i].y_pos);
			bw.append("\n");
		}
		//bw.write(bw.toString());
		bw.flush();

	}

}

class Sorted {
	int x_pos;
	int y_pos;

	public Sorted() {

	}

	public Sorted(int x_pos, int y_pos) {
		this.x_pos = x_pos;
		this.y_pos = y_pos;
	}

}