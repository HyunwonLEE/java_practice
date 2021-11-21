package coding_Test_369;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class SortApplication_03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		Arrow[] arrow = new Arrow[N];
		for (int i = 0; i < N; i++) {
			String[] arr = br.readLine().split(" ");
			int x = Integer.parseInt(arr[0]);
			int color = Integer.parseInt(arr[1]);

			arrow[i] = new Arrow(x, color);
		}

		Arrays.sort(arrow, new Comparator<Arrow>() {

			@Override
			public int compare(Arrow o1, Arrow o2) {
				if (o1.color == o2.color) {
					return o1.x - o2.x;
				}
				return o1.color - o2.color;
			}
		});

		int temp = 0;
		int answer = 0;
		for (int i = 0; i < N; i++) {
			temp = 100001;			
			if (i == 0) {
				if (arrow[i].color == arrow[i + 1].color) {
					temp = arrow[i + 1].x - arrow[i].x;
				}
			} else if (i == N -1) {
				if (arrow[i - 1].color == arrow[i].color) {
					temp = arrow[i].x - arrow[i - 1].x;
				}
			} else {

				if (arrow[i - 1].color == arrow[i].color) {
					temp = arrow[i].x - arrow[i - 1].x;
				}
				if (arrow[i].color == arrow[i + 1].color) {
					if (temp > arrow[i + 1].x - arrow[i].x) {
						temp = arrow[i + 1].x - arrow[i].x;
					}
				}
			}

			answer += temp;

		}

		System.out.println(answer);

	}

}

class Arrow {
	public int x;
	public int color;

	Arrow() {

	}

	public Arrow(int x, int color) {
		this.x = x;
		this.color = color;
	}
}