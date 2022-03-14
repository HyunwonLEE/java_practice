package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 알바생강호_1758 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);
		
		int sum = 0;
		int index = 0;
		for (int i = N - 1; i >= 0; i--) {
			int a = arr[i] - index++;
			if (a > 0) {
				sum += a;
				continue;
			}
			break;
		}
		System.out.println(sum);

	}	

}
