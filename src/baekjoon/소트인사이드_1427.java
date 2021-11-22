package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 소트인사이드_1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] arr = br.readLine().split("");
		
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return Integer.parseInt(o2) - Integer.parseInt(o1);
			}
		});
		
		for(int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
		}
		System.out.println(sb.toString());
	}

}
