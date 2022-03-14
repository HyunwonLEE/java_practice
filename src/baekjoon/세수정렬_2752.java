package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 세수정렬_2752 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int[] arr = new int[3];
		String[] sarr = br.readLine().split(" ");
		arr[0] = Integer.parseInt(sarr[0]);
		arr[1] = Integer.parseInt(sarr[1]);
		arr[2] = Integer.parseInt(sarr[2]);
		Arrays.sort(arr);
		for (Integer a : arr) {
			sb.append(a).append(' ');

		}
		System.out.println(sb.toString());
	}

}
